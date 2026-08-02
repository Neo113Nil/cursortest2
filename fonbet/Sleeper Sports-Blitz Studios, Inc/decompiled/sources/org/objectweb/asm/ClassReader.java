package org.objectweb.asm;

import androidx.core.view.ViewCompat;
import com.facebook.imageutils.JfifUtil;
import com.google.mlkit.common.MlKitException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;
import org.msgpack.core.MessagePack;

/* loaded from: classes10.dex */
public class ClassReader {
    static final int EXPAND_ASM_INSNS = 256;
    public static final int EXPAND_FRAMES = 8;
    private static final int INPUT_STREAM_DATA_CHUNK_SIZE = 4096;
    private static final int MAX_BUFFER_SIZE = 1048576;
    public static final int SKIP_CODE = 1;
    public static final int SKIP_DEBUG = 2;
    public static final int SKIP_FRAMES = 4;

    @Deprecated
    public final byte[] b;
    private final int[] bootstrapMethodOffsets;
    final byte[] classFileBuffer;
    private final ConstantDynamic[] constantDynamicValues;
    private final String[] constantUtf8Values;
    private final int[] cpInfoOffsets;
    public final int header;
    private final int maxStringLength;

    protected void readBytecodeInstructionOffset(int i) {
    }

    public ClassReader(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public ClassReader(byte[] bArr, int i, int i2) {
        this(bArr, i, true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    ClassReader(byte[] bArr, int i, boolean z) {
        this.classFileBuffer = bArr;
        this.b = bArr;
        if (z) {
            int i2 = i + 6;
            if (readShort(i2) > 65) {
                throw new IllegalArgumentException("Unsupported class file major version " + ((int) readShort(i2)));
            }
        }
        int readUnsignedShort = readUnsignedShort(i + 8);
        this.cpInfoOffsets = new int[readUnsignedShort];
        this.constantUtf8Values = new String[readUnsignedShort];
        int i3 = i + 10;
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i5 = 1;
        while (i5 < readUnsignedShort) {
            int i6 = i5 + 1;
            int i7 = i3 + 1;
            this.cpInfoOffsets[i5] = i7;
            int i8 = 3;
            switch (bArr[i3]) {
                case 1:
                    i8 = 3 + readUnsignedShort(i7);
                    if (i8 > i4) {
                        i5 = i6;
                        i4 = i8;
                        i3 += i8;
                    }
                    i5 = i6;
                    i3 += i8;
                case 2:
                case 13:
                case 14:
                default:
                    throw new IllegalArgumentException();
                case 3:
                case 4:
                case 9:
                case 10:
                case 11:
                case 12:
                    i5 = i6;
                    i8 = 5;
                    i3 += i8;
                case 5:
                case 6:
                    i5 += 2;
                    i8 = 9;
                    i3 += i8;
                case 7:
                case 8:
                case 16:
                case 19:
                case 20:
                    i5 = i6;
                    i3 += i8;
                case 15:
                    i8 = 4;
                    i5 = i6;
                    i3 += i8;
                case 17:
                    z2 = true;
                    z3 = true;
                    i5 = i6;
                    i8 = 5;
                    i3 += i8;
                case 18:
                    z3 = true;
                    i5 = i6;
                    i8 = 5;
                    i3 += i8;
            }
        }
        this.maxStringLength = i4;
        this.header = i3;
        this.constantDynamicValues = z2 ? new ConstantDynamic[readUnsignedShort] : null;
        this.bootstrapMethodOffsets = z3 ? readBootstrapMethodsAttribute(i4) : null;
    }

    public ClassReader(InputStream inputStream) throws IOException {
        this(readStream(inputStream, false));
    }

    public ClassReader(String str) throws IOException {
        this(readStream(ClassLoader.getSystemResourceAsStream(str.replace('.', IOUtils.DIR_SEPARATOR_UNIX) + ".class"), true));
    }

    private static byte[] readStream(InputStream inputStream, boolean z) throws IOException {
        if (inputStream == null) {
            throw new IOException("Class not found");
        }
        int computeBufferSize = computeBufferSize(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[computeBufferSize];
                int i = 0;
                while (true) {
                    int read = inputStream.read(bArr, 0, computeBufferSize);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                    i++;
                }
                byteArrayOutputStream.flush();
                if (i == 1) {
                    return bArr;
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                if (z) {
                    inputStream.close();
                }
                return byteArray;
            } finally {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable unused) {
                }
            }
        } finally {
            if (z) {
                inputStream.close();
            }
        }
    }

    private static int computeBufferSize(InputStream inputStream) throws IOException {
        int available = inputStream.available();
        if (available < 256) {
            return 4096;
        }
        return Math.min(available, 1048576);
    }

    public int getAccess() {
        return readUnsignedShort(this.header);
    }

    public String getClassName() {
        return readClass(this.header + 2, new char[this.maxStringLength]);
    }

    public String getSuperName() {
        return readClass(this.header + 4, new char[this.maxStringLength]);
    }

    public String[] getInterfaces() {
        int i = this.header + 6;
        int readUnsignedShort = readUnsignedShort(i);
        String[] strArr = new String[readUnsignedShort];
        if (readUnsignedShort > 0) {
            char[] cArr = new char[this.maxStringLength];
            for (int i2 = 0; i2 < readUnsignedShort; i2++) {
                i += 2;
                strArr[i2] = readClass(i, cArr);
            }
        }
        return strArr;
    }

    public void accept(ClassVisitor classVisitor, int i) {
        accept(classVisitor, new Attribute[0], i);
    }

    public void accept(ClassVisitor classVisitor, Attribute[] attributeArr, int i) {
        Context context;
        ClassReader classReader;
        Context context2;
        String str;
        int i2;
        int i3;
        String str2;
        int i4;
        String str3;
        String str4;
        int i5;
        Context context3 = new Context();
        context3.attributePrototypes = attributeArr;
        context3.parsingOptions = i;
        context3.charBuffer = new char[this.maxStringLength];
        char[] cArr = context3.charBuffer;
        int i6 = this.header;
        int readUnsignedShort = readUnsignedShort(i6);
        String readClass = readClass(i6 + 2, cArr);
        String readClass2 = readClass(i6 + 4, cArr);
        int readUnsignedShort2 = readUnsignedShort(i6 + 6);
        String[] strArr = new String[readUnsignedShort2];
        int i7 = i6 + 8;
        for (int i8 = 0; i8 < readUnsignedShort2; i8++) {
            strArr[i8] = readClass(i7, cArr);
            i7 += 2;
        }
        int firstAttributeOffset = getFirstAttributeOffset();
        int readUnsignedShort3 = readUnsignedShort(firstAttributeOffset - 2);
        String str5 = null;
        String str6 = null;
        String str7 = null;
        int i9 = 0;
        int i10 = 0;
        String str8 = null;
        int i11 = 0;
        int i12 = 0;
        String str9 = null;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        Attribute attribute = null;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (readUnsignedShort3 > 0) {
            int i20 = firstAttributeOffset;
            String readUTF8 = readUTF8(i20, cArr);
            int readInt = readInt(i20 + 2);
            String str10 = str5;
            int i21 = i20 + 6;
            String str11 = str6;
            if ("SourceFile".equals(readUTF8)) {
                str2 = readUTF8(i21, cArr);
                i5 = readUnsignedShort;
                i3 = i21;
                str3 = readClass;
                str6 = str11;
                i4 = readInt;
                context2 = context3;
            } else {
                if ("InnerClasses".equals(readUTF8)) {
                    i5 = readUnsignedShort;
                    i3 = i21;
                    i18 = i3;
                } else if ("EnclosingMethod".equals(readUTF8)) {
                    i5 = readUnsignedShort;
                    i3 = i21;
                    i10 = i3;
                } else {
                    if ("NestHost".equals(readUTF8)) {
                        str7 = readClass(i21, cArr);
                    } else if ("NestMembers".equals(readUTF8)) {
                        i5 = readUnsignedShort;
                        i3 = i21;
                        i16 = i3;
                    } else if ("PermittedSubclasses".equals(readUTF8)) {
                        i5 = readUnsignedShort;
                        i3 = i21;
                        i17 = i3;
                    } else if ("Signature".equals(readUTF8)) {
                        str8 = readUTF8(i21, cArr);
                    } else if ("RuntimeVisibleAnnotations".equals(readUTF8)) {
                        i5 = readUnsignedShort;
                        i3 = i21;
                        i9 = i3;
                    } else if ("RuntimeVisibleTypeAnnotations".equals(readUTF8)) {
                        i5 = readUnsignedShort;
                        i3 = i21;
                        i14 = i3;
                    } else {
                        if ("Deprecated".equals(readUTF8)) {
                            i5 = 131072 | readUnsignedShort;
                        } else if ("Synthetic".equals(readUTF8)) {
                            i5 = readUnsignedShort | 4096;
                        } else if ("SourceDebugExtension".equals(readUTF8)) {
                            if (readInt > this.classFileBuffer.length - i21) {
                                throw new IllegalArgumentException();
                            }
                            str6 = readUtf(i21, readInt, new char[readInt]);
                            i5 = readUnsignedShort;
                            i3 = i21;
                            context2 = context3;
                            str2 = str10;
                            i4 = readInt;
                            str3 = readClass;
                        } else if ("RuntimeInvisibleAnnotations".equals(readUTF8)) {
                            i5 = readUnsignedShort;
                            i3 = i21;
                            i13 = i3;
                        } else if ("RuntimeInvisibleTypeAnnotations".equals(readUTF8)) {
                            i5 = readUnsignedShort;
                            i3 = i21;
                            i15 = i3;
                        } else if ("Record".equals(readUTF8)) {
                            i5 = 65536 | readUnsignedShort;
                            i3 = i21;
                            i19 = i3;
                        } else if ("Module".equals(readUTF8)) {
                            i5 = readUnsignedShort;
                            i3 = i21;
                            i11 = i3;
                        } else if ("ModuleMainClass".equals(readUTF8)) {
                            str9 = readClass(i21, cArr);
                        } else if ("ModulePackages".equals(readUTF8)) {
                            i5 = readUnsignedShort;
                            i3 = i21;
                            i12 = i3;
                        } else {
                            if ("BootstrapMethods".equals(readUTF8)) {
                                context2 = context3;
                                str = str11;
                                i2 = readUnsignedShort;
                                i3 = i21;
                                str2 = str10;
                                i4 = readInt;
                                str3 = readClass;
                                str4 = str7;
                            } else {
                                context2 = context3;
                                str = str11;
                                str2 = str10;
                                str3 = readClass;
                                str4 = str7;
                                i2 = readUnsignedShort;
                                i3 = i21;
                                i4 = readInt;
                                Attribute readAttribute = readAttribute(attributeArr, readUTF8, i3, i4, cArr, -1, null);
                                readAttribute.nextAttribute = attribute;
                                attribute = readAttribute;
                            }
                            str6 = str;
                            str7 = str4;
                            i5 = i2;
                        }
                        i3 = i21;
                    }
                    i5 = readUnsignedShort;
                    i3 = i21;
                }
                str6 = str11;
                str2 = str10;
                i4 = readInt;
                context2 = context3;
                str3 = readClass;
            }
            int i22 = i3 + i4;
            readUnsignedShort3--;
            readUnsignedShort = i5;
            str5 = str2;
            context3 = context2;
            readClass = str3;
            firstAttributeOffset = i22;
        }
        String str12 = str5;
        Context context4 = context3;
        String str13 = readClass;
        String str14 = str6;
        String str15 = str7;
        Attribute attribute2 = attribute;
        classVisitor.visit(readInt(this.cpInfoOffsets[1] - 7), readUnsignedShort, str13, str8, readClass2, strArr);
        if ((i & 2) == 0 && (str12 != null || str14 != null)) {
            classVisitor.visitSource(str12, str14);
        }
        if (i11 != 0) {
            context = context4;
            classReader = this;
            classReader.readModuleAttributes(classVisitor, context, i11, i12, str9);
        } else {
            context = context4;
            classReader = this;
        }
        if (str15 != null) {
            classVisitor.visitNestHost(str15);
        }
        if (i10 != 0) {
            String readClass3 = classReader.readClass(i10, cArr);
            int readUnsignedShort4 = classReader.readUnsignedShort(i10 + 2);
            classVisitor.visitOuterClass(readClass3, readUnsignedShort4 == 0 ? null : classReader.readUTF8(classReader.cpInfoOffsets[readUnsignedShort4], cArr), readUnsignedShort4 == 0 ? null : classReader.readUTF8(classReader.cpInfoOffsets[readUnsignedShort4] + 2, cArr));
        }
        if (i9 != 0) {
            int readUnsignedShort5 = classReader.readUnsignedShort(i9);
            int i23 = i9 + 2;
            while (true) {
                int i24 = readUnsignedShort5 - 1;
                if (readUnsignedShort5 <= 0) {
                    break;
                }
                i23 = classReader.readElementValues(classVisitor.visitAnnotation(classReader.readUTF8(i23, cArr), true), i23 + 2, true, cArr);
                readUnsignedShort5 = i24;
            }
        }
        int i25 = i13;
        if (i25 != 0) {
            int readUnsignedShort6 = classReader.readUnsignedShort(i25);
            int i26 = i25 + 2;
            while (true) {
                int i27 = readUnsignedShort6 - 1;
                if (readUnsignedShort6 <= 0) {
                    break;
                }
                i26 = classReader.readElementValues(classVisitor.visitAnnotation(classReader.readUTF8(i26, cArr), false), i26 + 2, true, cArr);
                readUnsignedShort6 = i27;
            }
        }
        int i28 = i14;
        if (i28 != 0) {
            int readUnsignedShort7 = classReader.readUnsignedShort(i28);
            int i29 = i28 + 2;
            while (true) {
                int i30 = readUnsignedShort7 - 1;
                if (readUnsignedShort7 <= 0) {
                    break;
                }
                int readTypeAnnotationTarget = classReader.readTypeAnnotationTarget(context, i29);
                i29 = classReader.readElementValues(classVisitor.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, classReader.readUTF8(readTypeAnnotationTarget, cArr), true), readTypeAnnotationTarget + 2, true, cArr);
                readUnsignedShort7 = i30;
            }
        }
        int i31 = i15;
        if (i31 != 0) {
            int readUnsignedShort8 = classReader.readUnsignedShort(i31);
            int i32 = i31 + 2;
            while (true) {
                int i33 = readUnsignedShort8 - 1;
                if (readUnsignedShort8 <= 0) {
                    break;
                }
                int readTypeAnnotationTarget2 = classReader.readTypeAnnotationTarget(context, i32);
                i32 = classReader.readElementValues(classVisitor.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, classReader.readUTF8(readTypeAnnotationTarget2, cArr), false), readTypeAnnotationTarget2 + 2, true, cArr);
                readUnsignedShort8 = i33;
            }
        }
        while (attribute2 != null) {
            Attribute attribute3 = attribute2.nextAttribute;
            attribute2.nextAttribute = null;
            classVisitor.visitAttribute(attribute2);
            attribute2 = attribute3;
        }
        int i34 = i16;
        if (i34 != 0) {
            int readUnsignedShort9 = classReader.readUnsignedShort(i34);
            int i35 = i34 + 2;
            while (true) {
                int i36 = readUnsignedShort9 - 1;
                if (readUnsignedShort9 <= 0) {
                    break;
                }
                classVisitor.visitNestMember(classReader.readClass(i35, cArr));
                i35 += 2;
                readUnsignedShort9 = i36;
            }
        }
        int i37 = i17;
        if (i37 != 0) {
            int readUnsignedShort10 = classReader.readUnsignedShort(i37);
            int i38 = i37 + 2;
            while (true) {
                int i39 = readUnsignedShort10 - 1;
                if (readUnsignedShort10 <= 0) {
                    break;
                }
                classVisitor.visitPermittedSubclass(classReader.readClass(i38, cArr));
                i38 += 2;
                readUnsignedShort10 = i39;
            }
        }
        int i40 = i18;
        if (i40 != 0) {
            int readUnsignedShort11 = classReader.readUnsignedShort(i40);
            int i41 = i40 + 2;
            while (true) {
                int i42 = readUnsignedShort11 - 1;
                if (readUnsignedShort11 <= 0) {
                    break;
                }
                classVisitor.visitInnerClass(classReader.readClass(i41, cArr), classReader.readClass(i41 + 2, cArr), classReader.readUTF8(i41 + 4, cArr), classReader.readUnsignedShort(i41 + 6));
                i41 += 8;
                readUnsignedShort11 = i42;
            }
        }
        int i43 = i19;
        if (i43 != 0) {
            int readUnsignedShort12 = classReader.readUnsignedShort(i43);
            int i44 = i43 + 2;
            while (true) {
                int i45 = readUnsignedShort12 - 1;
                if (readUnsignedShort12 <= 0) {
                    break;
                }
                i44 = classReader.readRecordComponent(classVisitor, context, i44);
                readUnsignedShort12 = i45;
            }
        }
        int readUnsignedShort13 = classReader.readUnsignedShort(i7);
        int i46 = i7 + 2;
        while (true) {
            int i47 = readUnsignedShort13 - 1;
            if (readUnsignedShort13 <= 0) {
                break;
            }
            i46 = classReader.readField(classVisitor, context, i46);
            readUnsignedShort13 = i47;
        }
        int readUnsignedShort14 = classReader.readUnsignedShort(i46);
        int i48 = i46 + 2;
        while (true) {
            int i49 = readUnsignedShort14 - 1;
            if (readUnsignedShort14 > 0) {
                i48 = classReader.readMethod(classVisitor, context, i48);
                readUnsignedShort14 = i49;
            } else {
                classVisitor.visitEnd();
                return;
            }
        }
    }

    private void readModuleAttributes(ClassVisitor classVisitor, Context context, int i, int i2, String str) {
        String[] strArr;
        char[] cArr = context.charBuffer;
        int i3 = i + 6;
        ModuleVisitor visitModule = classVisitor.visitModule(readModule(i, cArr), readUnsignedShort(i + 2), readUTF8(i + 4, cArr));
        if (visitModule == null) {
            return;
        }
        if (str != null) {
            visitModule.visitMainClass(str);
        }
        if (i2 != 0) {
            int readUnsignedShort = readUnsignedShort(i2);
            int i4 = i2 + 2;
            while (true) {
                int i5 = readUnsignedShort - 1;
                if (readUnsignedShort <= 0) {
                    break;
                }
                visitModule.visitPackage(readPackage(i4, cArr));
                i4 += 2;
                readUnsignedShort = i5;
            }
        }
        int readUnsignedShort2 = readUnsignedShort(i3);
        int i6 = i + 8;
        while (true) {
            int i7 = readUnsignedShort2 - 1;
            if (readUnsignedShort2 <= 0) {
                break;
            }
            String readModule = readModule(i6, cArr);
            int readUnsignedShort3 = readUnsignedShort(i6 + 2);
            String readUTF8 = readUTF8(i6 + 4, cArr);
            i6 += 6;
            visitModule.visitRequire(readModule, readUnsignedShort3, readUTF8);
            readUnsignedShort2 = i7;
        }
        int readUnsignedShort4 = readUnsignedShort(i6);
        int i8 = i6 + 2;
        while (true) {
            int i9 = readUnsignedShort4 - 1;
            String[] strArr2 = null;
            if (readUnsignedShort4 <= 0) {
                break;
            }
            String readPackage = readPackage(i8, cArr);
            int readUnsignedShort5 = readUnsignedShort(i8 + 2);
            int readUnsignedShort6 = readUnsignedShort(i8 + 4);
            i8 += 6;
            if (readUnsignedShort6 != 0) {
                strArr2 = new String[readUnsignedShort6];
                for (int i10 = 0; i10 < readUnsignedShort6; i10++) {
                    strArr2[i10] = readModule(i8, cArr);
                    i8 += 2;
                }
            }
            visitModule.visitExport(readPackage, readUnsignedShort5, strArr2);
            readUnsignedShort4 = i9;
        }
        int readUnsignedShort7 = readUnsignedShort(i8);
        int i11 = i8 + 2;
        while (true) {
            int i12 = readUnsignedShort7 - 1;
            if (readUnsignedShort7 <= 0) {
                break;
            }
            String readPackage2 = readPackage(i11, cArr);
            int readUnsignedShort8 = readUnsignedShort(i11 + 2);
            int readUnsignedShort9 = readUnsignedShort(i11 + 4);
            i11 += 6;
            if (readUnsignedShort9 != 0) {
                strArr = new String[readUnsignedShort9];
                for (int i13 = 0; i13 < readUnsignedShort9; i13++) {
                    strArr[i13] = readModule(i11, cArr);
                    i11 += 2;
                }
            } else {
                strArr = null;
            }
            visitModule.visitOpen(readPackage2, readUnsignedShort8, strArr);
            readUnsignedShort7 = i12;
        }
        int readUnsignedShort10 = readUnsignedShort(i11);
        int i14 = i11 + 2;
        while (true) {
            int i15 = readUnsignedShort10 - 1;
            if (readUnsignedShort10 <= 0) {
                break;
            }
            visitModule.visitUse(readClass(i14, cArr));
            i14 += 2;
            readUnsignedShort10 = i15;
        }
        int readUnsignedShort11 = readUnsignedShort(i14);
        int i16 = i14 + 2;
        while (true) {
            int i17 = readUnsignedShort11 - 1;
            if (readUnsignedShort11 > 0) {
                String readClass = readClass(i16, cArr);
                int readUnsignedShort12 = readUnsignedShort(i16 + 2);
                i16 += 4;
                String[] strArr3 = new String[readUnsignedShort12];
                for (int i18 = 0; i18 < readUnsignedShort12; i18++) {
                    strArr3[i18] = readClass(i16, cArr);
                    i16 += 2;
                }
                visitModule.visitProvide(readClass, strArr3);
                readUnsignedShort11 = i17;
            } else {
                visitModule.visitEnd();
                return;
            }
        }
    }

    private int readRecordComponent(ClassVisitor classVisitor, Context context, int i) {
        int i2;
        int i3;
        Attribute attribute;
        char[] cArr = context.charBuffer;
        String readUTF8 = readUTF8(i, cArr);
        String readUTF82 = readUTF8(i + 2, cArr);
        int readUnsignedShort = readUnsignedShort(i + 4);
        int i4 = i + 6;
        int i5 = 0;
        Attribute attribute2 = null;
        int i6 = 0;
        String str = null;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int i9 = readUnsignedShort - 1;
            if (readUnsignedShort <= 0) {
                break;
            }
            String readUTF83 = readUTF8(i4, cArr);
            int readInt = readInt(i4 + 2);
            int i10 = i4 + 6;
            if ("Signature".equals(readUTF83)) {
                str = readUTF8(i10, cArr);
                int i11 = i5;
                i2 = i10;
                i10 = i11;
            } else {
                if ("RuntimeVisibleAnnotations".equals(readUTF83)) {
                    i7 = i10;
                    attribute = attribute2;
                    i3 = readInt;
                    i10 = i5;
                    i2 = i7;
                } else if ("RuntimeVisibleTypeAnnotations".equals(readUTF83)) {
                    i2 = i10;
                } else if ("RuntimeInvisibleAnnotations".equals(readUTF83)) {
                    i8 = i10;
                    attribute = attribute2;
                    i3 = readInt;
                    i10 = i5;
                    i2 = i8;
                } else if ("RuntimeInvisibleTypeAnnotations".equals(readUTF83)) {
                    i6 = i10;
                    attribute = attribute2;
                    i3 = readInt;
                    i10 = i5;
                    i2 = i6;
                } else {
                    int i12 = i5;
                    i2 = i10;
                    Attribute attribute3 = attribute2;
                    i3 = readInt;
                    Attribute readAttribute = readAttribute(context.attributePrototypes, readUTF83, i2, i3, cArr, -1, null);
                    readAttribute.nextAttribute = attribute3;
                    attribute = readAttribute;
                    i10 = i12;
                    i6 = i6;
                }
                int i13 = i2 + i3;
                i5 = i10;
                i4 = i13;
                attribute2 = attribute;
                readUnsignedShort = i9;
            }
            attribute = attribute2;
            i3 = readInt;
            int i132 = i2 + i3;
            i5 = i10;
            i4 = i132;
            attribute2 = attribute;
            readUnsignedShort = i9;
        }
        int i14 = i5;
        Attribute attribute4 = attribute2;
        int i15 = i6;
        RecordComponentVisitor visitRecordComponent = classVisitor.visitRecordComponent(readUTF8, readUTF82, str);
        if (visitRecordComponent == null) {
            return i4;
        }
        if (i7 != 0) {
            int readUnsignedShort2 = readUnsignedShort(i7);
            int i16 = i7 + 2;
            while (true) {
                int i17 = readUnsignedShort2 - 1;
                if (readUnsignedShort2 <= 0) {
                    break;
                }
                i16 = readElementValues(visitRecordComponent.visitAnnotation(readUTF8(i16, cArr), true), i16 + 2, true, cArr);
                readUnsignedShort2 = i17;
            }
        }
        if (i8 != 0) {
            int readUnsignedShort3 = readUnsignedShort(i8);
            int i18 = i8 + 2;
            while (true) {
                int i19 = readUnsignedShort3 - 1;
                if (readUnsignedShort3 <= 0) {
                    break;
                }
                i18 = readElementValues(visitRecordComponent.visitAnnotation(readUTF8(i18, cArr), false), i18 + 2, true, cArr);
                readUnsignedShort3 = i19;
            }
        }
        if (i14 != 0) {
            int readUnsignedShort4 = readUnsignedShort(i14);
            int i20 = i14 + 2;
            while (true) {
                int i21 = readUnsignedShort4 - 1;
                if (readUnsignedShort4 <= 0) {
                    break;
                }
                int readTypeAnnotationTarget = readTypeAnnotationTarget(context, i20);
                i20 = readElementValues(visitRecordComponent.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(readTypeAnnotationTarget, cArr), true), readTypeAnnotationTarget + 2, true, cArr);
                readUnsignedShort4 = i21;
            }
        }
        if (i15 != 0) {
            int readUnsignedShort5 = readUnsignedShort(i15);
            int i22 = i15 + 2;
            while (true) {
                int i23 = readUnsignedShort5 - 1;
                if (readUnsignedShort5 <= 0) {
                    break;
                }
                int readTypeAnnotationTarget2 = readTypeAnnotationTarget(context, i22);
                i22 = readElementValues(visitRecordComponent.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(readTypeAnnotationTarget2, cArr), false), readTypeAnnotationTarget2 + 2, true, cArr);
                readUnsignedShort5 = i23;
            }
        }
        Attribute attribute5 = attribute4;
        while (attribute5 != null) {
            Attribute attribute6 = attribute5.nextAttribute;
            attribute5.nextAttribute = null;
            visitRecordComponent.visitAttribute(attribute5);
            attribute5 = attribute6;
        }
        visitRecordComponent.visitEnd();
        return i4;
    }

    private int readField(ClassVisitor classVisitor, Context context, int i) {
        int i2;
        int i3;
        int i4;
        Context context2 = context;
        char[] cArr = context2.charBuffer;
        int readUnsignedShort = readUnsignedShort(i);
        String readUTF8 = readUTF8(i + 2, cArr);
        String readUTF82 = readUTF8(i + 4, cArr);
        int readUnsignedShort2 = readUnsignedShort(i + 6);
        int i5 = i + 8;
        int i6 = readUnsignedShort;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        String str = null;
        Object obj = null;
        Attribute attribute = null;
        while (true) {
            int i11 = readUnsignedShort2 - 1;
            if (readUnsignedShort2 <= 0) {
                break;
            }
            int i12 = i7;
            String readUTF83 = readUTF8(i5, cArr);
            int readInt = readInt(i5 + 2);
            int i13 = i5 + 6;
            if ("ConstantValue".equals(readUTF83)) {
                int readUnsignedShort3 = readUnsignedShort(i13);
                obj = readUnsignedShort3 == 0 ? null : readConst(readUnsignedShort3, cArr);
            } else if ("Signature".equals(readUTF83)) {
                str = readUTF8(i13, cArr);
            } else {
                if ("Deprecated".equals(readUTF83)) {
                    i4 = 131072 | i6;
                } else if ("Synthetic".equals(readUTF83)) {
                    i4 = i6 | 4096;
                } else {
                    if ("RuntimeVisibleAnnotations".equals(readUTF83)) {
                        i7 = i13;
                        i2 = i7;
                        i13 = i8;
                        i3 = readInt;
                    } else {
                        if ("RuntimeVisibleTypeAnnotations".equals(readUTF83)) {
                            i2 = i13;
                            i9 = i2;
                        } else if ("RuntimeInvisibleAnnotations".equals(readUTF83)) {
                            i2 = i13;
                            i3 = readInt;
                            i7 = i12;
                        } else if ("RuntimeInvisibleTypeAnnotations".equals(readUTF83)) {
                            i2 = i13;
                            i10 = i2;
                        } else {
                            i2 = i13;
                            int i14 = i8;
                            i3 = readInt;
                            Attribute readAttribute = readAttribute(context2.attributePrototypes, readUTF83, i2, i3, cArr, -1, null);
                            readAttribute.nextAttribute = attribute;
                            attribute = readAttribute;
                            i9 = i9;
                            i13 = i14;
                            i7 = i12;
                            i10 = i10;
                        }
                        i13 = i8;
                        i3 = readInt;
                        i7 = i12;
                    }
                    int i15 = i2 + i3;
                    context2 = context;
                    i8 = i13;
                    i5 = i15;
                    readUnsignedShort2 = i11;
                }
                i2 = i13;
                i6 = i4;
                i13 = i8;
                i3 = readInt;
                i7 = i12;
                int i152 = i2 + i3;
                context2 = context;
                i8 = i13;
                i5 = i152;
                readUnsignedShort2 = i11;
            }
            i2 = i13;
            i13 = i8;
            i3 = readInt;
            i7 = i12;
            int i1522 = i2 + i3;
            context2 = context;
            i8 = i13;
            i5 = i1522;
            readUnsignedShort2 = i11;
        }
        int i16 = i7;
        int i17 = i8;
        int i18 = i9;
        int i19 = i10;
        FieldVisitor visitField = classVisitor.visitField(i6, readUTF8, readUTF82, str, obj);
        if (visitField == null) {
            return i5;
        }
        if (i16 != 0) {
            int readUnsignedShort4 = readUnsignedShort(i16);
            int i20 = i16 + 2;
            while (true) {
                int i21 = readUnsignedShort4 - 1;
                if (readUnsignedShort4 <= 0) {
                    break;
                }
                i20 = readElementValues(visitField.visitAnnotation(readUTF8(i20, cArr), true), i20 + 2, true, cArr);
                readUnsignedShort4 = i21;
            }
        }
        if (i17 != 0) {
            int readUnsignedShort5 = readUnsignedShort(i17);
            int i22 = i17 + 2;
            while (true) {
                int i23 = readUnsignedShort5 - 1;
                if (readUnsignedShort5 <= 0) {
                    break;
                }
                i22 = readElementValues(visitField.visitAnnotation(readUTF8(i22, cArr), false), i22 + 2, true, cArr);
                readUnsignedShort5 = i23;
            }
        }
        if (i18 != 0) {
            int readUnsignedShort6 = readUnsignedShort(i18);
            int i24 = i18 + 2;
            while (true) {
                int i25 = readUnsignedShort6 - 1;
                if (readUnsignedShort6 <= 0) {
                    break;
                }
                int readTypeAnnotationTarget = readTypeAnnotationTarget(context, i24);
                i24 = readElementValues(visitField.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(readTypeAnnotationTarget, cArr), true), readTypeAnnotationTarget + 2, true, cArr);
                readUnsignedShort6 = i25;
            }
        }
        if (i19 != 0) {
            int readUnsignedShort7 = readUnsignedShort(i19);
            int i26 = i19 + 2;
            while (true) {
                int i27 = readUnsignedShort7 - 1;
                if (readUnsignedShort7 <= 0) {
                    break;
                }
                int readTypeAnnotationTarget2 = readTypeAnnotationTarget(context, i26);
                i26 = readElementValues(visitField.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(readTypeAnnotationTarget2, cArr), false), readTypeAnnotationTarget2 + 2, true, cArr);
                readUnsignedShort7 = i27;
            }
        }
        while (attribute != null) {
            Attribute attribute2 = attribute.nextAttribute;
            attribute.nextAttribute = null;
            visitField.visitAttribute(attribute);
            attribute = attribute2;
        }
        visitField.visitEnd();
        return i5;
    }

    private int readMethod(ClassVisitor classVisitor, Context context, int i) {
        int i2;
        char[] cArr;
        int i3;
        int i4;
        int i5;
        char[] cArr2;
        ClassReader classReader = this;
        char[] cArr3 = context.charBuffer;
        context.currentMethodAccessFlags = classReader.readUnsignedShort(i);
        context.currentMethodName = classReader.readUTF8(i + 2, cArr3);
        int i6 = i + 4;
        context.currentMethodDescriptor = classReader.readUTF8(i6, cArr3);
        int readUnsignedShort = classReader.readUnsignedShort(i + 6);
        int i7 = i + 8;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        Attribute attribute = null;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        String[] strArr = null;
        boolean z = false;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            int i19 = readUnsignedShort - 1;
            if (readUnsignedShort <= 0) {
                break;
            }
            int i20 = i8;
            String readUTF8 = classReader.readUTF8(i7, cArr3);
            int readInt = classReader.readInt(i7 + 2);
            int i21 = i9;
            int i22 = i7 + 6;
            int i23 = i20;
            if ("Code".equals(readUTF8)) {
                if ((context.parsingOptions & 1) == 0) {
                    i18 = i22;
                }
            } else if ("Exceptions".equals(readUTF8)) {
                int readUnsignedShort2 = classReader.readUnsignedShort(i22);
                int i24 = i7 + 8;
                strArr = new String[readUnsignedShort2];
                for (int i25 = 0; i25 < readUnsignedShort2; i25++) {
                    strArr[i25] = classReader.readClass(i24, cArr3);
                    i24 += 2;
                }
                i15 = i22;
            } else if ("Signature".equals(readUTF8)) {
                i12 = classReader.readUnsignedShort(i22);
            } else if ("Deprecated".equals(readUTF8)) {
                context.currentMethodAccessFlags |= 131072;
            } else if ("RuntimeVisibleAnnotations".equals(readUTF8)) {
                i23 = i22;
            } else if ("RuntimeVisibleTypeAnnotations".equals(readUTF8)) {
                i4 = i22;
                cArr2 = cArr3;
                i5 = readInt;
                i7 = i22 + i5;
                cArr3 = cArr2;
                readUnsignedShort = i19;
                i9 = i21;
                i8 = i23;
                i10 = i4;
            } else if ("AnnotationDefault".equals(readUTF8)) {
                i14 = i22;
            } else {
                if ("Synthetic".equals(readUTF8)) {
                    context.currentMethodAccessFlags |= 4096;
                    i4 = i10;
                    cArr2 = cArr3;
                    i5 = readInt;
                    z = true;
                } else if ("RuntimeInvisibleAnnotations".equals(readUTF8)) {
                    i21 = i22;
                } else if ("RuntimeInvisibleTypeAnnotations".equals(readUTF8)) {
                    i11 = i22;
                } else if ("RuntimeVisibleParameterAnnotations".equals(readUTF8)) {
                    i16 = i22;
                } else if ("RuntimeInvisibleParameterAnnotations".equals(readUTF8)) {
                    i17 = i22;
                } else if ("MethodParameters".equals(readUTF8)) {
                    i13 = i22;
                } else {
                    i4 = i10;
                    i5 = readInt;
                    Attribute readAttribute = classReader.readAttribute(context.attributePrototypes, readUTF8, i22, i5, cArr3, -1, null);
                    cArr2 = cArr3;
                    readAttribute.nextAttribute = attribute;
                    attribute = readAttribute;
                    i11 = i11;
                }
                i7 = i22 + i5;
                cArr3 = cArr2;
                readUnsignedShort = i19;
                i9 = i21;
                i8 = i23;
                i10 = i4;
            }
            i4 = i10;
            cArr2 = cArr3;
            i5 = readInt;
            i7 = i22 + i5;
            cArr3 = cArr2;
            readUnsignedShort = i19;
            i9 = i21;
            i8 = i23;
            i10 = i4;
        }
        int i26 = i8;
        int i27 = i9;
        int i28 = i10;
        char[] cArr4 = cArr3;
        int i29 = i11;
        int i30 = i14;
        int i31 = i13;
        MethodVisitor visitMethod = classVisitor.visitMethod(context.currentMethodAccessFlags, context.currentMethodName, context.currentMethodDescriptor, i12 == 0 ? null : classReader.readUtf(i12, cArr4), strArr);
        if (visitMethod == null) {
            return i7;
        }
        if (visitMethod instanceof MethodWriter) {
            MethodWriter methodWriter = (MethodWriter) visitMethod;
            i3 = i30;
            boolean z2 = (context.currentMethodAccessFlags & 131072) != 0;
            int readUnsignedShort3 = classReader.readUnsignedShort(i6);
            int i32 = i12;
            i2 = i31;
            cArr = cArr4;
            boolean canCopyMethodAttributes = methodWriter.canCopyMethodAttributes(classReader, z, z2, readUnsignedShort3, i32, i15);
            classReader = classReader;
            if (canCopyMethodAttributes) {
                methodWriter.setMethodAttributesSource(i, i7 - i);
                return i7;
            }
        } else {
            i2 = i31;
            cArr = cArr4;
            i3 = i30;
        }
        if (i2 != 0 && (context.parsingOptions & 2) == 0) {
            int readByte = classReader.readByte(i2);
            int i33 = i2 + 1;
            while (true) {
                int i34 = readByte - 1;
                if (readByte <= 0) {
                    break;
                }
                visitMethod.visitParameter(classReader.readUTF8(i33, cArr), classReader.readUnsignedShort(i33 + 2));
                i33 += 4;
                readByte = i34;
            }
        }
        if (i3 != 0) {
            AnnotationVisitor visitAnnotationDefault = visitMethod.visitAnnotationDefault();
            classReader.readElementValue(visitAnnotationDefault, i3, null, cArr);
            if (visitAnnotationDefault != null) {
                visitAnnotationDefault.visitEnd();
            }
        }
        if (i26 != 0) {
            int readUnsignedShort4 = classReader.readUnsignedShort(i26);
            int i35 = i26 + 2;
            while (true) {
                int i36 = readUnsignedShort4 - 1;
                if (readUnsignedShort4 <= 0) {
                    break;
                }
                i35 = classReader.readElementValues(visitMethod.visitAnnotation(classReader.readUTF8(i35, cArr), true), i35 + 2, true, cArr);
                readUnsignedShort4 = i36;
            }
        }
        if (i27 != 0) {
            int readUnsignedShort5 = classReader.readUnsignedShort(i27);
            int i37 = i27 + 2;
            while (true) {
                int i38 = readUnsignedShort5 - 1;
                if (readUnsignedShort5 <= 0) {
                    break;
                }
                i37 = classReader.readElementValues(visitMethod.visitAnnotation(classReader.readUTF8(i37, cArr), false), i37 + 2, true, cArr);
                readUnsignedShort5 = i38;
            }
        }
        if (i28 != 0) {
            int readUnsignedShort6 = classReader.readUnsignedShort(i28);
            int i39 = i28 + 2;
            while (true) {
                int i40 = readUnsignedShort6 - 1;
                if (readUnsignedShort6 <= 0) {
                    break;
                }
                int readTypeAnnotationTarget = classReader.readTypeAnnotationTarget(context, i39);
                i39 = classReader.readElementValues(visitMethod.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, classReader.readUTF8(readTypeAnnotationTarget, cArr), true), readTypeAnnotationTarget + 2, true, cArr);
                readUnsignedShort6 = i40;
            }
        }
        if (i29 != 0) {
            int readUnsignedShort7 = classReader.readUnsignedShort(i29);
            int i41 = i29 + 2;
            while (true) {
                int i42 = readUnsignedShort7 - 1;
                if (readUnsignedShort7 <= 0) {
                    break;
                }
                int readTypeAnnotationTarget2 = classReader.readTypeAnnotationTarget(context, i41);
                i41 = classReader.readElementValues(visitMethod.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, classReader.readUTF8(readTypeAnnotationTarget2, cArr), false), readTypeAnnotationTarget2 + 2, true, cArr);
                readUnsignedShort7 = i42;
            }
        }
        int i43 = i16;
        if (i43 != 0) {
            classReader.readParameterAnnotations(visitMethod, context, i43, true);
        }
        int i44 = i17;
        if (i44 != 0) {
            classReader.readParameterAnnotations(visitMethod, context, i44, false);
        }
        while (attribute != null) {
            Attribute attribute2 = attribute.nextAttribute;
            attribute.nextAttribute = null;
            visitMethod.visitAttribute(attribute);
            attribute = attribute2;
        }
        int i45 = i18;
        if (i45 != 0) {
            visitMethod.visitCode();
            classReader.readCode(visitMethod, context, i45);
        }
        visitMethod.visitEnd();
        return i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:194:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x06fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void readCode(MethodVisitor methodVisitor, Context context, int i) {
        int i2;
        char[] cArr;
        Attribute attribute;
        byte[] bArr;
        int i3;
        int i4;
        Label[] labelArr;
        boolean z;
        int i5;
        MethodVisitor methodVisitor2;
        int i6;
        int[] iArr;
        int i7;
        String str;
        int i8;
        boolean z2;
        int i9;
        int[] iArr2;
        boolean z3;
        boolean z4;
        int i10;
        int i11;
        String str2;
        boolean z5;
        char c;
        int i12;
        int i13;
        boolean z6;
        int i14;
        int i15;
        boolean z7;
        int[] iArr3;
        int i16;
        int i17;
        boolean z8;
        int i18;
        int i19;
        int i20;
        boolean z9;
        int i21;
        int[] iArr4;
        int[] iArr5;
        int i22;
        int i23;
        int i24;
        byte b;
        int readUnsignedShort;
        int[] iArr6;
        byte b2;
        ClassReader classReader;
        Label[] labelArr2;
        ClassReader classReader2 = this;
        MethodVisitor methodVisitor3 = methodVisitor;
        byte[] bArr2 = classReader2.classFileBuffer;
        char[] cArr2 = context.charBuffer;
        int readUnsignedShort2 = classReader2.readUnsignedShort(i);
        int readUnsignedShort3 = classReader2.readUnsignedShort(i + 2);
        int readInt = classReader2.readInt(i + 4);
        int i25 = i + 8;
        if (readInt > classReader2.classFileBuffer.length - i25) {
            throw new IllegalArgumentException();
        }
        int i26 = i25 + readInt;
        Label[] labelArr3 = new Label[readInt + 1];
        context.currentMethodLabels = labelArr3;
        int i27 = i25;
        while (i27 < i26) {
            int i28 = i27 - i25;
            switch (bArr2[i27] & 255) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                case 76:
                case 77:
                case 78:
                case 79:
                case 80:
                case 81:
                case 82:
                case 83:
                case 84:
                case 85:
                case 86:
                case 87:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                case 93:
                case 94:
                case 95:
                case 96:
                case 97:
                case 98:
                case 99:
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                case 106:
                case 107:
                case 108:
                case 109:
                case 110:
                case 111:
                case 112:
                case 113:
                case 114:
                case 115:
                case 116:
                case 117:
                case 118:
                case 119:
                case 120:
                case 121:
                case 122:
                case 123:
                case 124:
                case 125:
                case 126:
                case 127:
                case 128:
                case 129:
                case 130:
                case 131:
                case 133:
                case 134:
                case 135:
                case 136:
                case 137:
                case 138:
                case 139:
                case 140:
                case 141:
                case 142:
                case 143:
                case 144:
                case 145:
                case 146:
                case 147:
                case 148:
                case 149:
                case 150:
                case 151:
                case 152:
                case 172:
                case Opcodes.LRETURN /* 173 */:
                case Opcodes.FRETURN /* 174 */:
                case Opcodes.DRETURN /* 175 */:
                case Opcodes.ARETURN /* 176 */:
                case Opcodes.RETURN /* 177 */:
                case 190:
                case Opcodes.ATHROW /* 191 */:
                case Opcodes.MONITORENTER /* 194 */:
                case Opcodes.MONITOREXIT /* 195 */:
                    i27++;
                case 16:
                case 18:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case Opcodes.RET /* 169 */:
                case 188:
                    i27 += 2;
                case 17:
                case 19:
                case 20:
                case 132:
                case Opcodes.GETSTATIC /* 178 */:
                case Opcodes.PUTSTATIC /* 179 */:
                case 180:
                case Opcodes.PUTFIELD /* 181 */:
                case Opcodes.INVOKEVIRTUAL /* 182 */:
                case Opcodes.INVOKESPECIAL /* 183 */:
                case Opcodes.INVOKESTATIC /* 184 */:
                case Opcodes.NEW /* 187 */:
                case 189:
                case 192:
                case Opcodes.INSTANCEOF /* 193 */:
                    i27 += 3;
                case 153:
                case 154:
                case 155:
                case 156:
                case 157:
                case 158:
                case 159:
                case 160:
                case 161:
                case Opcodes.IF_ICMPGE /* 162 */:
                case Opcodes.IF_ICMPGT /* 163 */:
                case Opcodes.IF_ICMPLE /* 164 */:
                case Opcodes.IF_ACMPEQ /* 165 */:
                case Opcodes.IF_ACMPNE /* 166 */:
                case Opcodes.GOTO /* 167 */:
                case Opcodes.JSR /* 168 */:
                case Opcodes.IFNULL /* 198 */:
                case Opcodes.IFNONNULL /* 199 */:
                    classReader2.createLabel(i28 + classReader2.readShort(i27 + 1), labelArr3);
                    i27 += 3;
                case Opcodes.TABLESWITCH /* 170 */:
                    int i29 = i27 + (4 - (i28 & 3));
                    classReader2.createLabel(i28 + classReader2.readInt(i29), labelArr3);
                    int readInt2 = (classReader2.readInt(i29 + 8) - classReader2.readInt(i29 + 4)) + 1;
                    i27 = i29 + 12;
                    while (true) {
                        int i30 = readInt2 - 1;
                        if (readInt2 > 0) {
                            classReader2.createLabel(i28 + classReader2.readInt(i27), labelArr3);
                            i27 += 4;
                            readInt2 = i30;
                        }
                    }
                    break;
                case Opcodes.LOOKUPSWITCH /* 171 */:
                    int i31 = i27 + (4 - (i28 & 3));
                    classReader2.createLabel(i28 + classReader2.readInt(i31), labelArr3);
                    int readInt3 = classReader2.readInt(i31 + 4);
                    i27 = i31 + 8;
                    while (true) {
                        int i32 = readInt3 - 1;
                        if (readInt3 > 0) {
                            classReader2.createLabel(i28 + classReader2.readInt(i27 + 4), labelArr3);
                            i27 += 8;
                            readInt3 = i32;
                        }
                    }
                    break;
                case Opcodes.INVOKEINTERFACE /* 185 */:
                case Opcodes.INVOKEDYNAMIC /* 186 */:
                    i27 += 5;
                case 196:
                    int i33 = bArr2[i27 + 1] & 255;
                    if (i33 != 132) {
                        if (i33 != 169) {
                            switch (i33) {
                                default:
                                    switch (i33) {
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                            break;
                                        default:
                                            throw new IllegalArgumentException();
                                    }
                                case 21:
                                case 22:
                                case 23:
                                case 24:
                                case 25:
                                    i27 += 4;
                            }
                        }
                        i27 += 4;
                    } else {
                        i27 += 6;
                    }
                case Opcodes.MULTIANEWARRAY /* 197 */:
                    i27 += 4;
                case 200:
                case 201:
                case 220:
                    classReader2.createLabel(i28 + classReader2.readInt(i27 + 1), labelArr3);
                    i27 += 5;
                case 202:
                case 203:
                case 204:
                case MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR /* 205 */:
                case 206:
                case 207:
                case JfifUtil.MARKER_RST0 /* 208 */:
                case 209:
                case 210:
                case 211:
                case 212:
                case 213:
                case 214:
                case JfifUtil.MARKER_RST7 /* 215 */:
                case JfifUtil.MARKER_SOI /* 216 */:
                case JfifUtil.MARKER_EOI /* 217 */:
                case JfifUtil.MARKER_SOS /* 218 */:
                case 219:
                    classReader2.createLabel(i28 + classReader2.readUnsignedShort(i27 + 1), labelArr3);
                    i27 += 3;
                default:
                    throw new IllegalArgumentException();
            }
        }
        byte b3 = 8;
        int readUnsignedShort4 = classReader2.readUnsignedShort(i27);
        int i34 = i27 + 2;
        while (true) {
            int i35 = readUnsignedShort4 - 1;
            if (readUnsignedShort4 > 0) {
                Label createLabel = classReader2.createLabel(classReader2.readUnsignedShort(i34), labelArr3);
                Label createLabel2 = classReader2.createLabel(classReader2.readUnsignedShort(i34 + 2), labelArr3);
                Label createLabel3 = classReader2.createLabel(classReader2.readUnsignedShort(i34 + 4), labelArr3);
                String readUTF8 = classReader2.readUTF8(classReader2.cpInfoOffsets[classReader2.readUnsignedShort(i34 + 6)], cArr2);
                i34 += 8;
                methodVisitor3.visitTryCatchBlock(createLabel, createLabel2, createLabel3, readUTF8);
                readUnsignedShort4 = i35;
            } else {
                int readUnsignedShort5 = classReader2.readUnsignedShort(i34);
                int i36 = i34 + 2;
                int[] iArr7 = null;
                int i37 = 0;
                int[] iArr8 = null;
                int i38 = 0;
                Attribute attribute2 = null;
                boolean z10 = true;
                int i39 = 0;
                int i40 = 0;
                while (true) {
                    int i41 = readUnsignedShort5 - 1;
                    if (readUnsignedShort5 > 0) {
                        String readUTF82 = classReader2.readUTF8(i36, cArr2);
                        int readInt4 = classReader2.readInt(i36 + 2);
                        int i42 = i36 + 6;
                        if ("LocalVariableTable".equals(readUTF82)) {
                            if ((context.parsingOptions & 2) == 0) {
                                int readUnsignedShort6 = classReader2.readUnsignedShort(i42);
                                int i43 = i36 + 8;
                                while (true) {
                                    int i44 = readUnsignedShort6 - 1;
                                    if (readUnsignedShort6 > 0) {
                                        int readUnsignedShort7 = classReader2.readUnsignedShort(i43);
                                        classReader2.createDebugLabel(readUnsignedShort7, labelArr3);
                                        int i45 = i43;
                                        classReader2.createDebugLabel(readUnsignedShort7 + classReader2.readUnsignedShort(i45 + 2), labelArr3);
                                        i43 = i45 + 10;
                                        readUnsignedShort6 = i44;
                                    } else {
                                        i39 = i42;
                                    }
                                }
                            }
                        } else if ("LocalVariableTypeTable".equals(readUTF82)) {
                            i40 = i42;
                        } else if ("LineNumberTable".equals(readUTF82)) {
                            if ((context.parsingOptions & 2) == 0) {
                                int readUnsignedShort8 = classReader2.readUnsignedShort(i42);
                                int i46 = i36 + 8;
                                while (true) {
                                    int i47 = readUnsignedShort8 - 1;
                                    if (readUnsignedShort8 > 0) {
                                        int readUnsignedShort9 = classReader2.readUnsignedShort(i46);
                                        int i48 = i46;
                                        int readUnsignedShort10 = classReader2.readUnsignedShort(i48 + 2);
                                        classReader2.createDebugLabel(readUnsignedShort9, labelArr3);
                                        labelArr3[readUnsignedShort9].addLineNumber(readUnsignedShort10);
                                        readUnsignedShort8 = i47;
                                        i46 = i48 + 4;
                                    }
                                }
                            }
                        } else {
                            if ("RuntimeVisibleTypeAnnotations".equals(readUTF82)) {
                                classReader = classReader2;
                                iArr6 = classReader2.readTypeAnnotations(methodVisitor3, context, i42, true);
                                labelArr2 = labelArr3;
                                b2 = b3;
                            } else if ("RuntimeInvisibleTypeAnnotations".equals(readUTF82)) {
                                iArr8 = classReader2.readTypeAnnotations(methodVisitor3, context, i42, false);
                            } else if ("StackMapTable".equals(readUTF82)) {
                                if ((context.parsingOptions & 4) == 0) {
                                    i37 = i36 + 8;
                                    i38 = i42 + readInt4;
                                }
                            } else if ("StackMap".equals(readUTF82)) {
                                if ((context.parsingOptions & 4) == 0) {
                                    i37 = i36 + 8;
                                    i38 = i42 + readInt4;
                                    iArr6 = iArr7;
                                    b2 = b3;
                                    z10 = false;
                                    classReader = classReader2;
                                    labelArr2 = labelArr3;
                                }
                            } else {
                                iArr6 = iArr7;
                                b2 = b3;
                                Attribute readAttribute = classReader2.readAttribute(context.attributePrototypes, readUTF82, i42, readInt4, cArr2, i, labelArr3);
                                classReader = classReader2;
                                labelArr2 = labelArr3;
                                readAttribute.nextAttribute = attribute2;
                                attribute2 = readAttribute;
                            }
                            i36 = i42 + readInt4;
                            labelArr3 = labelArr2;
                            classReader2 = classReader;
                            b3 = b2;
                            readUnsignedShort5 = i41;
                            iArr7 = iArr6;
                            methodVisitor3 = methodVisitor;
                        }
                        iArr6 = iArr7;
                        b2 = b3;
                        classReader = classReader2;
                        labelArr2 = labelArr3;
                        i36 = i42 + readInt4;
                        labelArr3 = labelArr2;
                        classReader2 = classReader;
                        b3 = b2;
                        readUnsignedShort5 = i41;
                        iArr7 = iArr6;
                        methodVisitor3 = methodVisitor;
                    } else {
                        int[] iArr9 = iArr7;
                        byte b4 = b3;
                        boolean z11 = true;
                        ClassReader classReader3 = classReader2;
                        Label[] labelArr4 = labelArr3;
                        Attribute attribute3 = attribute2;
                        boolean z12 = (context.parsingOptions & b4) != 0;
                        if (i37 != 0) {
                            context.currentFrameOffset = -1;
                            context.currentFrameType = 0;
                            context.currentFrameLocalCount = 0;
                            context.currentFrameLocalCountDelta = 0;
                            context.currentFrameLocalTypes = new Object[readUnsignedShort3];
                            context.currentFrameStackCount = 0;
                            context.currentFrameStackTypes = new Object[readUnsignedShort2];
                            if (z12) {
                                classReader3.computeImplicitFrame(context);
                            }
                            int i49 = i37;
                            while (true) {
                                i2 = i38;
                                if (i49 < i2 - 2) {
                                    if (bArr2[i49] != b4 || (readUnsignedShort = classReader3.readUnsignedShort(i49 + 1)) < 0 || readUnsignedShort >= readInt) {
                                        i24 = i49;
                                        b = b4;
                                    } else {
                                        b = b4;
                                        i24 = i49;
                                        if ((bArr2[i25 + readUnsignedShort] & 255) == 187) {
                                            classReader3.createLabel(readUnsignedShort, labelArr4);
                                        }
                                    }
                                    i49 = i24 + 1;
                                    i38 = i2;
                                    b4 = b;
                                }
                            }
                        } else {
                            i2 = i38;
                        }
                        if (!z12 || (context.parsingOptions & 256) == 0) {
                            cArr = cArr2;
                            attribute = attribute3;
                            bArr = bArr2;
                            i3 = readUnsignedShort3;
                            i4 = readInt;
                            labelArr = labelArr4;
                            z = z12;
                            i5 = i2;
                            methodVisitor2 = methodVisitor;
                        } else {
                            attribute = attribute3;
                            z = z12;
                            bArr = bArr2;
                            i5 = i2;
                            cArr = cArr2;
                            i3 = readUnsignedShort3;
                            i4 = readInt;
                            labelArr = labelArr4;
                            methodVisitor2 = methodVisitor;
                            methodVisitor2.visitFrame(-1, i3, null, 0, null);
                        }
                        int[] iArr10 = iArr9;
                        int typeAnnotationBytecodeOffset = classReader3.getTypeAnnotationBytecodeOffset(iArr10, 0);
                        int[] iArr11 = iArr8;
                        int typeAnnotationBytecodeOffset2 = classReader3.getTypeAnnotationBytecodeOffset(iArr11, 0);
                        int i50 = (context.parsingOptions & 256) == 0 ? 33 : 0;
                        int i51 = i37;
                        int i52 = typeAnnotationBytecodeOffset;
                        int i53 = i51;
                        int i54 = i25;
                        int i55 = typeAnnotationBytecodeOffset2;
                        boolean z13 = false;
                        int i56 = 0;
                        int i57 = 0;
                        while (i54 < i26) {
                            int i58 = i54;
                            int i59 = i58 - i25;
                            classReader3.readBytecodeInstructionOffset(i59);
                            int[] iArr12 = iArr10;
                            Label label = labelArr[i59];
                            int i60 = i3;
                            if (label != null) {
                                label.accept(methodVisitor2, (context.parsingOptions & 2) == 0 ? z11 : false);
                            }
                            while (true) {
                                if (i53 != 0) {
                                    if (context.currentFrameOffset != i59) {
                                        i19 = -1;
                                        if (context.currentFrameOffset != -1) {
                                            int[] iArr13 = iArr12;
                                            i8 = readUnsignedShort2;
                                            z2 = z10;
                                            i9 = i26;
                                            iArr2 = iArr13;
                                        }
                                    } else {
                                        i19 = -1;
                                    }
                                    if (context.currentFrameOffset != i19) {
                                        if (!z10 || z) {
                                            int[] iArr14 = iArr12;
                                            i20 = readUnsignedShort2;
                                            z9 = z10;
                                            i21 = i26;
                                            iArr4 = iArr14;
                                            iArr5 = iArr11;
                                            i22 = i25;
                                            i23 = i53;
                                            methodVisitor.visitFrame(-1, context.currentFrameLocalCount, context.currentFrameLocalTypes, context.currentFrameStackCount, context.currentFrameStackTypes);
                                        } else {
                                            iArr5 = iArr11;
                                            int[] iArr15 = iArr12;
                                            i20 = readUnsignedShort2;
                                            z9 = z10;
                                            i21 = i26;
                                            iArr4 = iArr15;
                                            i22 = i25;
                                            i23 = i53;
                                            methodVisitor2.visitFrame(context.currentFrameType, context.currentFrameLocalCountDelta, context.currentFrameLocalTypes, context.currentFrameStackCount, context.currentFrameStackTypes);
                                        }
                                        z13 = false;
                                    } else {
                                        int[] iArr16 = iArr12;
                                        i20 = readUnsignedShort2;
                                        z9 = z10;
                                        i21 = i26;
                                        iArr4 = iArr16;
                                        iArr5 = iArr11;
                                        i22 = i25;
                                        i23 = i53;
                                    }
                                    if (i23 < i5) {
                                        i53 = classReader3.readStackMapFrame(i23, z9, z, context);
                                        int i61 = i21;
                                        z10 = z9;
                                        readUnsignedShort2 = i20;
                                        iArr12 = iArr4;
                                        i26 = i61;
                                        methodVisitor2 = methodVisitor;
                                        iArr11 = iArr5;
                                        i25 = i22;
                                    } else {
                                        int i62 = i21;
                                        z10 = z9;
                                        readUnsignedShort2 = i20;
                                        iArr12 = iArr4;
                                        i26 = i62;
                                        methodVisitor2 = methodVisitor;
                                        iArr11 = iArr5;
                                        i25 = i22;
                                        i53 = 0;
                                    }
                                } else {
                                    int[] iArr17 = iArr12;
                                    i8 = readUnsignedShort2;
                                    z2 = z10;
                                    i9 = i26;
                                    iArr2 = iArr17;
                                }
                            }
                            int[] iArr18 = iArr11;
                            int i63 = i25;
                            int i64 = i53;
                            if (z13) {
                                if ((context.parsingOptions & 8) != 0) {
                                    methodVisitor2 = methodVisitor;
                                    methodVisitor2.visitFrame(256, 0, null, 0, null);
                                } else {
                                    methodVisitor2 = methodVisitor;
                                }
                                z3 = false;
                            } else {
                                methodVisitor2 = methodVisitor;
                                z3 = z13;
                            }
                            int i65 = bArr[i58] & 255;
                            switch (i65) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 46:
                                case 47:
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                case 85:
                                case 86:
                                case 87:
                                case 88:
                                case 89:
                                case 90:
                                case 91:
                                case 92:
                                case 93:
                                case 94:
                                case 95:
                                case 96:
                                case 97:
                                case 98:
                                case 99:
                                case 100:
                                case 101:
                                case 102:
                                case 103:
                                case 104:
                                case 105:
                                case 106:
                                case 107:
                                case 108:
                                case 109:
                                case 110:
                                case 111:
                                case 112:
                                case 113:
                                case 114:
                                case 115:
                                case 116:
                                case 117:
                                case 118:
                                case 119:
                                case 120:
                                case 121:
                                case 122:
                                case 123:
                                case 124:
                                case 125:
                                case 126:
                                case 127:
                                case 128:
                                case 129:
                                case 130:
                                case 131:
                                case 133:
                                case 134:
                                case 135:
                                case 136:
                                case 137:
                                case 138:
                                case 139:
                                case 140:
                                case 141:
                                case 142:
                                case 143:
                                case 144:
                                case 145:
                                case 146:
                                case 147:
                                case 148:
                                case 149:
                                case 150:
                                case 151:
                                case 152:
                                case 172:
                                case Opcodes.LRETURN /* 173 */:
                                case Opcodes.FRETURN /* 174 */:
                                case Opcodes.DRETURN /* 175 */:
                                case Opcodes.ARETURN /* 176 */:
                                case Opcodes.RETURN /* 177 */:
                                case 190:
                                case Opcodes.ATHROW /* 191 */:
                                case Opcodes.MONITORENTER /* 194 */:
                                case Opcodes.MONITOREXIT /* 195 */:
                                    z4 = z;
                                    i10 = i5;
                                    methodVisitor2.visitInsn(i65);
                                    i11 = i58 + 1;
                                    i12 = i52;
                                    i13 = i56;
                                    z13 = z3;
                                    while (iArr2 != null && i13 < iArr2.length && i12 <= i59) {
                                        if (i12 != i59) {
                                            int readTypeAnnotationTarget = classReader3.readTypeAnnotationTarget(context, iArr2[i13]);
                                            i18 = i11;
                                            boolean z14 = z11;
                                            classReader3.readElementValues(methodVisitor2.visitInsnAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, classReader3.readUTF8(readTypeAnnotationTarget, cArr), z14), readTypeAnnotationTarget + 2, z14, cArr);
                                        } else {
                                            i18 = i11;
                                        }
                                        i13++;
                                        i12 = classReader3.getTypeAnnotationBytecodeOffset(iArr2, i13);
                                        i11 = i18;
                                        z11 = true;
                                    }
                                    int i66 = i11;
                                    int i67 = i57;
                                    int i68 = i55;
                                    while (iArr18 != null) {
                                        iArr3 = iArr18;
                                        if (i67 >= iArr3.length || i68 > i59) {
                                            i14 = i67;
                                            i15 = i12;
                                            z7 = z2;
                                            z = z4;
                                            iArr10 = iArr2;
                                            i54 = i66;
                                            i26 = i9;
                                            i52 = i15;
                                            z10 = z7;
                                            readUnsignedShort2 = i8;
                                            i3 = i60;
                                            z11 = true;
                                            i55 = i68;
                                            iArr11 = iArr3;
                                            i57 = i14;
                                            i5 = i10;
                                            i56 = i13;
                                            i53 = i64;
                                            i25 = i63;
                                        } else {
                                            if (i68 == i59) {
                                                int readTypeAnnotationTarget2 = classReader3.readTypeAnnotationTarget(context, iArr3[i67]);
                                                i16 = i67;
                                                i17 = i12;
                                                z8 = z2;
                                                classReader3.readElementValues(methodVisitor2.visitInsnAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, classReader3.readUTF8(readTypeAnnotationTarget2, cArr), false), readTypeAnnotationTarget2 + 2, true, cArr);
                                            } else {
                                                i16 = i67;
                                                i17 = i12;
                                                z8 = z2;
                                            }
                                            i67 = i16 + 1;
                                            i68 = classReader3.getTypeAnnotationBytecodeOffset(iArr3, i67);
                                            iArr18 = iArr3;
                                            i12 = i17;
                                            z2 = z8;
                                        }
                                    }
                                    i14 = i67;
                                    i15 = i12;
                                    z7 = z2;
                                    iArr3 = iArr18;
                                    z = z4;
                                    iArr10 = iArr2;
                                    i54 = i66;
                                    i26 = i9;
                                    i52 = i15;
                                    z10 = z7;
                                    readUnsignedShort2 = i8;
                                    i3 = i60;
                                    z11 = true;
                                    i55 = i68;
                                    iArr11 = iArr3;
                                    i57 = i14;
                                    i5 = i10;
                                    i56 = i13;
                                    i53 = i64;
                                    i25 = i63;
                                    break;
                                case 16:
                                case 188:
                                    z4 = z;
                                    i10 = i5;
                                    methodVisitor2.visitIntInsn(i65, bArr[i58 + 1]);
                                    i11 = i58 + 2;
                                    i12 = i52;
                                    i13 = i56;
                                    z13 = z3;
                                    while (iArr2 != null) {
                                        if (i12 != i59) {
                                        }
                                        i13++;
                                        i12 = classReader3.getTypeAnnotationBytecodeOffset(iArr2, i13);
                                        i11 = i18;
                                        z11 = true;
                                        break;
                                    }
                                    int i662 = i11;
                                    int i672 = i57;
                                    int i682 = i55;
                                    while (iArr18 != null) {
                                    }
                                    i14 = i672;
                                    i15 = i12;
                                    z7 = z2;
                                    iArr3 = iArr18;
                                    z = z4;
                                    iArr10 = iArr2;
                                    i54 = i662;
                                    i26 = i9;
                                    i52 = i15;
                                    z10 = z7;
                                    readUnsignedShort2 = i8;
                                    i3 = i60;
                                    z11 = true;
                                    i55 = i682;
                                    iArr11 = iArr3;
                                    i57 = i14;
                                    i5 = i10;
                                    i56 = i13;
                                    i53 = i64;
                                    i25 = i63;
                                    break;
                                case 17:
                                    z4 = z;
                                    i10 = i5;
                                    methodVisitor2.visitIntInsn(i65, classReader3.readShort(i58 + 1));
                                    i11 = i58 + 3;
                                    i12 = i52;
                                    i13 = i56;
                                    z13 = z3;
                                    while (iArr2 != null) {
                                    }
                                    int i6622 = i11;
                                    int i6722 = i57;
                                    int i6822 = i55;
                                    while (iArr18 != null) {
                                    }
                                    i14 = i6722;
                                    i15 = i12;
                                    z7 = z2;
                                    iArr3 = iArr18;
                                    z = z4;
                                    iArr10 = iArr2;
                                    i54 = i6622;
                                    i26 = i9;
                                    i52 = i15;
                                    z10 = z7;
                                    readUnsignedShort2 = i8;
                                    i3 = i60;
                                    z11 = true;
                                    i55 = i6822;
                                    iArr11 = iArr3;
                                    i57 = i14;
                                    i5 = i10;
                                    i56 = i13;
                                    i53 = i64;
                                    i25 = i63;
                                case 18:
                                    z4 = z;
                                    i10 = i5;
                                    methodVisitor2.visitLdcInsn(classReader3.readConst(bArr[i58 + 1] & 255, cArr));
                                    i11 = i58 + 2;
                                    i12 = i52;
                                    i13 = i56;
                                    z13 = z3;
                                    while (iArr2 != null) {
                                    }
                                    int i66222 = i11;
                                    int i67222 = i57;
                                    int i68222 = i55;
                                    while (iArr18 != null) {
                                    }
                                    i14 = i67222;
                                    i15 = i12;
                                    z7 = z2;
                                    iArr3 = iArr18;
                                    z = z4;
                                    iArr10 = iArr2;
                                    i54 = i66222;
                                    i26 = i9;
                                    i52 = i15;
                                    z10 = z7;
                                    readUnsignedShort2 = i8;
                                    i3 = i60;
                                    z11 = true;
                                    i55 = i68222;
                                    iArr11 = iArr3;
                                    i57 = i14;
                                    i5 = i10;
                                    i56 = i13;
                                    i53 = i64;
                                    i25 = i63;
                                case 19:
                                case 20:
                                    z4 = z;
                                    i10 = i5;
                                    methodVisitor2.visitLdcInsn(classReader3.readConst(classReader3.readUnsignedShort(i58 + 1), cArr));
                                    i11 = i58 + 3;
                                    i12 = i52;
                                    i13 = i56;
                                    z13 = z3;
                                    while (iArr2 != null) {
                                    }
                                    int i662222 = i11;
                                    int i672222 = i57;
                                    int i682222 = i55;
                                    while (iArr18 != null) {
                                    }
                                    i14 = i672222;
                                    i15 = i12;
                                    z7 = z2;
                                    iArr3 = iArr18;
                                    z = z4;
                                    iArr10 = iArr2;
                                    i54 = i662222;
                                    i26 = i9;
                                    i52 = i15;
                                    z10 = z7;
                                    readUnsignedShort2 = i8;
                                    i3 = i60;
                                    z11 = true;
                                    i55 = i682222;
                                    iArr11 = iArr3;
                                    i57 = i14;
                                    i5 = i10;
                                    i56 = i13;
                                    i53 = i64;
                                    i25 = i63;
                                case 21:
                                case 22:
                                case 23:
                                case 24:
                                case 25:
                                case 54:
                                case 55:
                                case 56:
                                case 57:
                                case 58:
                                case Opcodes.RET /* 169 */:
                                    z4 = z;
                                    i10 = i5;
                                    methodVisitor2.visitVarInsn(i65, bArr[i58 + 1] & 255);
                                    i11 = i58 + 2;
                                    i12 = i52;
                                    i13 = i56;
                                    z13 = z3;
                                    while (iArr2 != null) {
                                    }
                                    int i6622222 = i11;
                                    int i6722222 = i57;
                                    int i6822222 = i55;
                                    while (iArr18 != null) {
                                    }
                                    i14 = i6722222;
                                    i15 = i12;
                                    z7 = z2;
                                    iArr3 = iArr18;
                                    z = z4;
                                    iArr10 = iArr2;
                                    i54 = i6622222;
                                    i26 = i9;
                                    i52 = i15;
                                    z10 = z7;
                                    readUnsignedShort2 = i8;
                                    i3 = i60;
                                    z11 = true;
                                    i55 = i6822222;
                                    iArr11 = iArr3;
                                    i57 = i14;
                                    i5 = i10;
                                    i56 = i13;
                                    i53 = i64;
                                    i25 = i63;
                                case 26:
                                case 27:
                                case 28:
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                case 33:
                                case 34:
                                case 35:
                                case 36:
                                case 37:
                                case 38:
                                case 39:
                                case 40:
                                case 41:
                                case 42:
                                case 43:
                                case 44:
                                case 45:
                                    z4 = z;
                                    i10 = i5;
                                    int i69 = i65 - 26;
                                    methodVisitor2.visitVarInsn((i69 >> 2) + 21, i69 & 3);
                                    i11 = i58 + 1;
                                    i12 = i52;
                                    i13 = i56;
                                    z13 = z3;
                                    while (iArr2 != null) {
                                    }
                                    int i66222222 = i11;
                                    int i67222222 = i57;
                                    int i68222222 = i55;
                                    while (iArr18 != null) {
                                    }
                                    i14 = i67222222;
                                    i15 = i12;
                                    z7 = z2;
                                    iArr3 = iArr18;
                                    z = z4;
                                    iArr10 = iArr2;
                                    i54 = i66222222;
                                    i26 = i9;
                                    i52 = i15;
                                    z10 = z7;
                                    readUnsignedShort2 = i8;
                                    i3 = i60;
                                    z11 = true;
                                    i55 = i68222222;
                                    iArr11 = iArr3;
                                    i57 = i14;
                                    i5 = i10;
                                    i56 = i13;
                                    i53 = i64;
                                    i25 = i63;
                                case 59:
                                case 60:
                                case 61:
                                case 62:
                                case 63:
                                case 64:
                                case 65:
                                case 66:
                                case 67:
                                case 68:
                                case 69:
                                case 70:
                                case 71:
                                case 72:
                                case 73:
                                case 74:
                                case 75:
                                case 76:
                                case 77:
                                case 78:
                                    z4 = z;
                                    i10 = i5;
                                    int i70 = i65 - 59;
                                    methodVisitor2.visitVarInsn((i70 >> 2) + 54, i70 & 3);
                                    i11 = i58 + 1;
                                    i12 = i52;
                                    i13 = i56;
                                    z13 = z3;
                                    while (iArr2 != null) {
                                    }
                                    int i662222222 = i11;
                                    int i672222222 = i57;
                                    int i682222222 = i55;
                                    while (iArr18 != null) {
                                    }
                                    i14 = i672222222;
                                    i15 = i12;
                                    z7 = z2;
                                    iArr3 = iArr18;
                                    z = z4;
                                    iArr10 = iArr2;
                                    i54 = i662222222;
                                    i26 = i9;
                                    i52 = i15;
                                    z10 = z7;
                                    readUnsignedShort2 = i8;
                                    i3 = i60;
                                    z11 = true;
                                    i55 = i682222222;
                                    iArr11 = iArr3;
                                    i57 = i14;
                                    i5 = i10;
                                    i56 = i13;
                                    i53 = i64;
                                    i25 = i63;
                                case 132:
                                    z4 = z;
                                    i10 = i5;
                                    methodVisitor2.visitIincInsn(bArr[i58 + 1] & 255, bArr[i58 + 2]);
                                    i11 = i58 + 3;
                                    i12 = i52;
                                    i13 = i56;
                                    z13 = z3;
                                    while (iArr2 != null) {
                                    }
                                    int i6622222222 = i11;
                                    int i6722222222 = i57;
                                    int i6822222222 = i55;
                                    while (iArr18 != null) {
                                    }
                                    i14 = i6722222222;
                                    i15 = i12;
                                    z7 = z2;
                                    iArr3 = iArr18;
                                    z = z4;
                                    iArr10 = iArr2;
                                    i54 = i6622222222;
                                    i26 = i9;
                                    i52 = i15;
                                    z10 = z7;
                                    readUnsignedShort2 = i8;
                                    i3 = i60;
                                    z11 = true;
                                    i55 = i6822222222;
                                    iArr11 = iArr3;
                                    i57 = i14;
                                    i5 = i10;
                                    i56 = i13;
                                    i53 = i64;
                                    i25 = i63;
                                case 153:
                                case 154:
                                case 155:
                                case 156:
                                case 157:
                                case 158:
                                case 159:
                                case 160:
                                case 161:
                                case Opcodes.IF_ICMPGE /* 162 */:
                                case Opcodes.IF_ICMPGT /* 163 */:
                                case Opcodes.IF_ICMPLE /* 164 */:
                                case Opcodes.IF_ACMPEQ /* 165 */:
                                case Opcodes.IF_ACMPNE /* 166 */:
                                case Opcodes.GOTO /* 167 */:
                                case Opcodes.JSR /* 168 */:
                                case Opcodes.IFNULL /* 198 */:
                                case Opcodes.IFNONNULL /* 199 */:
                                    z4 = z;
                                    i10 = i5;
                                    methodVisitor2.visitJumpInsn(i65, labelArr[classReader3.readShort(i58 + 1) + i59]);
                                    i11 = i58 + 3;
                                    i12 = i52;
                                    i13 = i56;
                                    z13 = z3;
                                    while (iArr2 != null) {
                                    }
                                    int i66222222222 = i11;
                                    int i67222222222 = i57;
                                    int i68222222222 = i55;
                                    while (iArr18 != null) {
                                    }
                                    i14 = i67222222222;
                                    i15 = i12;
                                    z7 = z2;
                                    iArr3 = iArr18;
                                    z = z4;
                                    iArr10 = iArr2;
                                    i54 = i66222222222;
                                    i26 = i9;
                                    i52 = i15;
                                    z10 = z7;
                                    readUnsignedShort2 = i8;
                                    i3 = i60;
                                    z11 = true;
                                    i55 = i68222222222;
                                    iArr11 = iArr3;
                                    i57 = i14;
                                    i5 = i10;
                                    i56 = i13;
                                    i53 = i64;
                                    i25 = i63;
                                case Opcodes.TABLESWITCH /* 170 */:
                                    z4 = z;
                                    i10 = i5;
                                    int i71 = i58 + (4 - (i59 & 3));
                                    Label label2 = labelArr[classReader3.readInt(i71) + i59];
                                    int readInt5 = classReader3.readInt(i71 + 4);
                                    int readInt6 = classReader3.readInt(i71 + 8);
                                    i11 = i71 + 12;
                                    int i72 = (readInt6 - readInt5) + 1;
                                    Label[] labelArr5 = new Label[i72];
                                    for (int i73 = 0; i73 < i72; i73++) {
                                        labelArr5[i73] = labelArr[i59 + classReader3.readInt(i11)];
                                        i11 += 4;
                                    }
                                    methodVisitor2.visitTableSwitchInsn(readInt5, readInt6, label2, labelArr5);
                                    i12 = i52;
                                    i13 = i56;
                                    z13 = z3;
                                    while (iArr2 != null) {
                                    }
                                    int i662222222222 = i11;
                                    int i672222222222 = i57;
                                    int i682222222222 = i55;
                                    while (iArr18 != null) {
                                    }
                                    i14 = i672222222222;
                                    i15 = i12;
                                    z7 = z2;
                                    iArr3 = iArr18;
                                    z = z4;
                                    iArr10 = iArr2;
                                    i54 = i662222222222;
                                    i26 = i9;
                                    i52 = i15;
                                    z10 = z7;
                                    readUnsignedShort2 = i8;
                                    i3 = i60;
                                    z11 = true;
                                    i55 = i682222222222;
                                    iArr11 = iArr3;
                                    i57 = i14;
                                    i5 = i10;
                                    i56 = i13;
                                    i53 = i64;
                                    i25 = i63;
                                case Opcodes.LOOKUPSWITCH /* 171 */:
                                    z4 = z;
                                    i10 = i5;
                                    int i74 = i58 + (4 - (i59 & 3));
                                    Label label3 = labelArr[classReader3.readInt(i74) + i59];
                                    int readInt7 = classReader3.readInt(i74 + 4);
                                    i11 = i74 + 8;
                                    int[] iArr19 = new int[readInt7];
                                    Label[] labelArr6 = new Label[readInt7];
                                    for (int i75 = 0; i75 < readInt7; i75++) {
                                        iArr19[i75] = classReader3.readInt(i11);
                                        labelArr6[i75] = labelArr[classReader3.readInt(i11 + 4) + i59];
                                        i11 += 8;
                                    }
                                    methodVisitor2.visitLookupSwitchInsn(label3, iArr19, labelArr6);
                                    i12 = i52;
                                    i13 = i56;
                                    z13 = z3;
                                    while (iArr2 != null) {
                                    }
                                    int i6622222222222 = i11;
                                    int i6722222222222 = i57;
                                    int i6822222222222 = i55;
                                    while (iArr18 != null) {
                                    }
                                    i14 = i6722222222222;
                                    i15 = i12;
                                    z7 = z2;
                                    iArr3 = iArr18;
                                    z = z4;
                                    iArr10 = iArr2;
                                    i54 = i6622222222222;
                                    i26 = i9;
                                    i52 = i15;
                                    z10 = z7;
                                    readUnsignedShort2 = i8;
                                    i3 = i60;
                                    z11 = true;
                                    i55 = i6822222222222;
                                    iArr11 = iArr3;
                                    i57 = i14;
                                    i5 = i10;
                                    i56 = i13;
                                    i53 = i64;
                                    i25 = i63;
                                case Opcodes.GETSTATIC /* 178 */:
                                case Opcodes.PUTSTATIC /* 179 */:
                                case 180:
                                case Opcodes.PUTFIELD /* 181 */:
                                case Opcodes.INVOKEVIRTUAL /* 182 */:
                                case Opcodes.INVOKESPECIAL /* 183 */:
                                case Opcodes.INVOKESTATIC /* 184 */:
                                case Opcodes.INVOKEINTERFACE /* 185 */:
                                    z4 = z;
                                    i10 = i5;
                                    int i76 = classReader3.cpInfoOffsets[classReader3.readUnsignedShort(i58 + 1)];
                                    int i77 = classReader3.cpInfoOffsets[classReader3.readUnsignedShort(i76 + 2)];
                                    String readClass = classReader3.readClass(i76, cArr);
                                    String readUTF83 = classReader3.readUTF8(i77, cArr);
                                    String readUTF84 = classReader3.readUTF8(i77 + 2, cArr);
                                    if (i65 < 182) {
                                        methodVisitor2.visitFieldInsn(i65, readClass, readUTF83, readUTF84);
                                    } else {
                                        if (bArr[i76 - 1] == 11) {
                                            str2 = readUTF84;
                                            z5 = z11;
                                        } else {
                                            str2 = readUTF84;
                                            z5 = false;
                                        }
                                        methodVisitor2.visitMethodInsn(i65, readClass, readUTF83, str2, z5);
                                    }
                                    if (i65 == 185) {
                                        i11 = i58 + 5;
                                        i12 = i52;
                                        i13 = i56;
                                        z13 = z3;
                                        while (iArr2 != null) {
                                        }
                                        int i66222222222222 = i11;
                                        int i67222222222222 = i57;
                                        int i68222222222222 = i55;
                                        while (iArr18 != null) {
                                        }
                                        i14 = i67222222222222;
                                        i15 = i12;
                                        z7 = z2;
                                        iArr3 = iArr18;
                                        z = z4;
                                        iArr10 = iArr2;
                                        i54 = i66222222222222;
                                        i26 = i9;
                                        i52 = i15;
                                        z10 = z7;
                                        readUnsignedShort2 = i8;
                                        i3 = i60;
                                        z11 = true;
                                        i55 = i68222222222222;
                                        iArr11 = iArr3;
                                        i57 = i14;
                                        i5 = i10;
                                        i56 = i13;
                                        i53 = i64;
                                        i25 = i63;
                                    }
                                    i11 = i58 + 3;
                                    i12 = i52;
                                    i13 = i56;
                                    z13 = z3;
                                    while (iArr2 != null) {
                                    }
                                    int i662222222222222 = i11;
                                    int i672222222222222 = i57;
                                    int i682222222222222 = i55;
                                    while (iArr18 != null) {
                                    }
                                    i14 = i672222222222222;
                                    i15 = i12;
                                    z7 = z2;
                                    iArr3 = iArr18;
                                    z = z4;
                                    iArr10 = iArr2;
                                    i54 = i662222222222222;
                                    i26 = i9;
                                    i52 = i15;
                                    z10 = z7;
                                    readUnsignedShort2 = i8;
                                    i3 = i60;
                                    z11 = true;
                                    i55 = i682222222222222;
                                    iArr11 = iArr3;
                                    i57 = i14;
                                    i5 = i10;
                                    i56 = i13;
                                    i53 = i64;
                                    i25 = i63;
                                case Opcodes.INVOKEDYNAMIC /* 186 */:
                                    int i78 = classReader3.cpInfoOffsets[classReader3.readUnsignedShort(i58 + 1)];
                                    int i79 = classReader3.cpInfoOffsets[classReader3.readUnsignedShort(i78 + 2)];
                                    String readUTF85 = classReader3.readUTF8(i79, cArr);
                                    String readUTF86 = classReader3.readUTF8(i79 + 2, cArr);
                                    int i80 = classReader3.bootstrapMethodOffsets[classReader3.readUnsignedShort(i78)];
                                    Handle handle = (Handle) classReader3.readConst(classReader3.readUnsignedShort(i80), cArr);
                                    int readUnsignedShort11 = classReader3.readUnsignedShort(i80 + 2);
                                    Object[] objArr = new Object[readUnsignedShort11];
                                    i10 = i5;
                                    int i81 = i80 + 4;
                                    z4 = z;
                                    int i82 = 0;
                                    while (i82 < readUnsignedShort11) {
                                        objArr[i82] = classReader3.readConst(classReader3.readUnsignedShort(i81), cArr);
                                        i81 += 2;
                                        i82++;
                                        readUnsignedShort11 = readUnsignedShort11;
                                    }
                                    methodVisitor2.visitInvokeDynamicInsn(readUTF85, readUTF86, handle, objArr);
                                    i11 = i58 + 5;
                                    i12 = i52;
                                    i13 = i56;
                                    z13 = z3;
                                    while (iArr2 != null) {
                                    }
                                    int i6622222222222222 = i11;
                                    int i6722222222222222 = i57;
                                    int i6822222222222222 = i55;
                                    while (iArr18 != null) {
                                    }
                                    i14 = i6722222222222222;
                                    i15 = i12;
                                    z7 = z2;
                                    iArr3 = iArr18;
                                    z = z4;
                                    iArr10 = iArr2;
                                    i54 = i6622222222222222;
                                    i26 = i9;
                                    i52 = i15;
                                    z10 = z7;
                                    readUnsignedShort2 = i8;
                                    i3 = i60;
                                    z11 = true;
                                    i55 = i6822222222222222;
                                    iArr11 = iArr3;
                                    i57 = i14;
                                    i5 = i10;
                                    i56 = i13;
                                    i53 = i64;
                                    i25 = i63;
                                case Opcodes.NEW /* 187 */:
                                case 189:
                                case 192:
                                case Opcodes.INSTANCEOF /* 193 */:
                                    c = 132;
                                    methodVisitor2.visitTypeInsn(i65, classReader3.readClass(i58 + 1, cArr));
                                    i11 = i58 + 3;
                                    z4 = z;
                                    i10 = i5;
                                    i12 = i52;
                                    i13 = i56;
                                    z13 = z3;
                                    while (iArr2 != null) {
                                    }
                                    int i66222222222222222 = i11;
                                    int i67222222222222222 = i57;
                                    int i68222222222222222 = i55;
                                    while (iArr18 != null) {
                                    }
                                    i14 = i67222222222222222;
                                    i15 = i12;
                                    z7 = z2;
                                    iArr3 = iArr18;
                                    z = z4;
                                    iArr10 = iArr2;
                                    i54 = i66222222222222222;
                                    i26 = i9;
                                    i52 = i15;
                                    z10 = z7;
                                    readUnsignedShort2 = i8;
                                    i3 = i60;
                                    z11 = true;
                                    i55 = i68222222222222222;
                                    iArr11 = iArr3;
                                    i57 = i14;
                                    i5 = i10;
                                    i56 = i13;
                                    i53 = i64;
                                    i25 = i63;
                                case 196:
                                    int i83 = bArr[i58 + 1] & 255;
                                    c = 132;
                                    if (i83 == 132) {
                                        methodVisitor2.visitIincInsn(classReader3.readUnsignedShort(i58 + 2), classReader3.readShort(i58 + 4));
                                        i11 = i58 + 6;
                                    } else {
                                        methodVisitor2.visitVarInsn(i83, classReader3.readUnsignedShort(i58 + 2));
                                        i11 = i58 + 4;
                                    }
                                    z4 = z;
                                    i10 = i5;
                                    i12 = i52;
                                    i13 = i56;
                                    z13 = z3;
                                    while (iArr2 != null) {
                                    }
                                    int i662222222222222222 = i11;
                                    int i672222222222222222 = i57;
                                    int i682222222222222222 = i55;
                                    while (iArr18 != null) {
                                    }
                                    i14 = i672222222222222222;
                                    i15 = i12;
                                    z7 = z2;
                                    iArr3 = iArr18;
                                    z = z4;
                                    iArr10 = iArr2;
                                    i54 = i662222222222222222;
                                    i26 = i9;
                                    i52 = i15;
                                    z10 = z7;
                                    readUnsignedShort2 = i8;
                                    i3 = i60;
                                    z11 = true;
                                    i55 = i682222222222222222;
                                    iArr11 = iArr3;
                                    i57 = i14;
                                    i5 = i10;
                                    i56 = i13;
                                    i53 = i64;
                                    i25 = i63;
                                case Opcodes.MULTIANEWARRAY /* 197 */:
                                    methodVisitor2.visitMultiANewArrayInsn(classReader3.readClass(i58 + 1, cArr), bArr[i58 + 3] & 255);
                                    i11 = i58 + 4;
                                    z4 = z;
                                    i10 = i5;
                                    i12 = i52;
                                    i13 = i56;
                                    z13 = z3;
                                    while (iArr2 != null) {
                                    }
                                    int i6622222222222222222 = i11;
                                    int i6722222222222222222 = i57;
                                    int i6822222222222222222 = i55;
                                    while (iArr18 != null) {
                                    }
                                    i14 = i6722222222222222222;
                                    i15 = i12;
                                    z7 = z2;
                                    iArr3 = iArr18;
                                    z = z4;
                                    iArr10 = iArr2;
                                    i54 = i6622222222222222222;
                                    i26 = i9;
                                    i52 = i15;
                                    z10 = z7;
                                    readUnsignedShort2 = i8;
                                    i3 = i60;
                                    z11 = true;
                                    i55 = i6822222222222222222;
                                    iArr11 = iArr3;
                                    i57 = i14;
                                    i5 = i10;
                                    i56 = i13;
                                    i53 = i64;
                                    i25 = i63;
                                case 200:
                                case 201:
                                    methodVisitor2.visitJumpInsn(i65 - i50, labelArr[classReader3.readInt(i58 + 1) + i59]);
                                    i11 = i58 + 5;
                                    z4 = z;
                                    i10 = i5;
                                    i12 = i52;
                                    i13 = i56;
                                    z13 = z3;
                                    while (iArr2 != null) {
                                    }
                                    int i66222222222222222222 = i11;
                                    int i67222222222222222222 = i57;
                                    int i68222222222222222222 = i55;
                                    while (iArr18 != null) {
                                    }
                                    i14 = i67222222222222222222;
                                    i15 = i12;
                                    z7 = z2;
                                    iArr3 = iArr18;
                                    z = z4;
                                    iArr10 = iArr2;
                                    i54 = i66222222222222222222;
                                    i26 = i9;
                                    i52 = i15;
                                    z10 = z7;
                                    readUnsignedShort2 = i8;
                                    i3 = i60;
                                    z11 = true;
                                    i55 = i68222222222222222222;
                                    iArr11 = iArr3;
                                    i57 = i14;
                                    i5 = i10;
                                    i56 = i13;
                                    i53 = i64;
                                    i25 = i63;
                                case 202:
                                case 203:
                                case 204:
                                case MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR /* 205 */:
                                case 206:
                                case 207:
                                case JfifUtil.MARKER_RST0 /* 208 */:
                                case 209:
                                case 210:
                                case 211:
                                case 212:
                                case 213:
                                case 214:
                                case JfifUtil.MARKER_RST7 /* 215 */:
                                case JfifUtil.MARKER_SOI /* 216 */:
                                case JfifUtil.MARKER_EOI /* 217 */:
                                case JfifUtil.MARKER_SOS /* 218 */:
                                case 219:
                                    int i84 = i65 < 218 ? i65 - 49 : i65 - 20;
                                    Label label4 = labelArr[classReader3.readUnsignedShort(i58 + 1) + i59];
                                    if (i84 == 167 || i84 == 168) {
                                        methodVisitor2.visitJumpInsn(i84 + 33, label4);
                                        z6 = z3;
                                    } else {
                                        methodVisitor2.visitJumpInsn(i84 < 167 ? ((i84 + 1) ^ 1) - 1 : i84 ^ 1, classReader3.createLabel(i59 + 3, labelArr));
                                        methodVisitor2.visitJumpInsn(200, label4);
                                        z6 = z11;
                                    }
                                    i11 = i58 + 3;
                                    z13 = z6;
                                    z4 = z;
                                    i10 = i5;
                                    i12 = i52;
                                    i13 = i56;
                                    while (iArr2 != null) {
                                    }
                                    int i662222222222222222222 = i11;
                                    int i672222222222222222222 = i57;
                                    int i682222222222222222222 = i55;
                                    while (iArr18 != null) {
                                    }
                                    i14 = i672222222222222222222;
                                    i15 = i12;
                                    z7 = z2;
                                    iArr3 = iArr18;
                                    z = z4;
                                    iArr10 = iArr2;
                                    i54 = i662222222222222222222;
                                    i26 = i9;
                                    i52 = i15;
                                    z10 = z7;
                                    readUnsignedShort2 = i8;
                                    i3 = i60;
                                    z11 = true;
                                    i55 = i682222222222222222222;
                                    iArr11 = iArr3;
                                    i57 = i14;
                                    i5 = i10;
                                    i56 = i13;
                                    i53 = i64;
                                    i25 = i63;
                                    break;
                                case 220:
                                    methodVisitor2.visitJumpInsn(200, labelArr[classReader3.readInt(i58 + 1) + i59]);
                                    i11 = i58 + 5;
                                    z4 = z;
                                    i10 = i5;
                                    i12 = i52;
                                    z13 = z11;
                                    i13 = i56;
                                    while (iArr2 != null) {
                                    }
                                    int i6622222222222222222222 = i11;
                                    int i6722222222222222222222 = i57;
                                    int i6822222222222222222222 = i55;
                                    while (iArr18 != null) {
                                    }
                                    i14 = i6722222222222222222222;
                                    i15 = i12;
                                    z7 = z2;
                                    iArr3 = iArr18;
                                    z = z4;
                                    iArr10 = iArr2;
                                    i54 = i6622222222222222222222;
                                    i26 = i9;
                                    i52 = i15;
                                    z10 = z7;
                                    readUnsignedShort2 = i8;
                                    i3 = i60;
                                    z11 = true;
                                    i55 = i6822222222222222222222;
                                    iArr11 = iArr3;
                                    i57 = i14;
                                    i5 = i10;
                                    i56 = i13;
                                    i53 = i64;
                                    i25 = i63;
                                default:
                                    throw new AssertionError();
                            }
                        }
                        int[] iArr20 = iArr10;
                        int i85 = i3;
                        int[] iArr21 = iArr11;
                        int i86 = readUnsignedShort2;
                        int i87 = 0;
                        Label label5 = labelArr[i4];
                        if (label5 != null) {
                            methodVisitor2.visitLabel(label5);
                        }
                        int i88 = i39;
                        if (i88 != 0 && (context.parsingOptions & 2) == 0) {
                            int i89 = i40;
                            if (i89 != 0) {
                                int readUnsignedShort12 = classReader3.readUnsignedShort(i89) * 3;
                                int[] iArr22 = new int[readUnsignedShort12];
                                int i90 = i89 + 2;
                                while (readUnsignedShort12 > 0) {
                                    iArr22[readUnsignedShort12 - 1] = i90 + 6;
                                    iArr22[readUnsignedShort12 - 2] = classReader3.readUnsignedShort(i90 + 8);
                                    readUnsignedShort12 -= 3;
                                    iArr22[readUnsignedShort12] = classReader3.readUnsignedShort(i90);
                                    i90 += 10;
                                }
                                iArr = iArr22;
                            } else {
                                iArr = null;
                            }
                            int readUnsignedShort13 = classReader3.readUnsignedShort(i88);
                            int i91 = i88 + 2;
                            while (true) {
                                int i92 = readUnsignedShort13 - 1;
                                if (readUnsignedShort13 > 0) {
                                    int readUnsignedShort14 = classReader3.readUnsignedShort(i91);
                                    int readUnsignedShort15 = classReader3.readUnsignedShort(i91 + 2);
                                    String readUTF87 = classReader3.readUTF8(i91 + 4, cArr);
                                    String readUTF88 = classReader3.readUTF8(i91 + 6, cArr);
                                    int readUnsignedShort16 = classReader3.readUnsignedShort(i91 + 8);
                                    int i93 = i91 + 10;
                                    if (iArr != null) {
                                        for (int i94 = i87; i94 < iArr.length; i94 += 3) {
                                            if (iArr[i94] == readUnsignedShort14 && iArr[i94 + 1] == readUnsignedShort16) {
                                                str = classReader3.readUTF8(iArr[i94 + 2], cArr);
                                                i7 = readUnsignedShort15;
                                                methodVisitor2.visitLocalVariable(readUTF87, readUTF88, str, labelArr[readUnsignedShort14], labelArr[i7 + readUnsignedShort14], readUnsignedShort16);
                                                methodVisitor2 = methodVisitor;
                                                classReader3 = classReader3;
                                                readUnsignedShort13 = i92;
                                                i91 = i93;
                                                i87 = 0;
                                            }
                                        }
                                    }
                                    i7 = readUnsignedShort15;
                                    str = null;
                                    methodVisitor2.visitLocalVariable(readUTF87, readUTF88, str, labelArr[readUnsignedShort14], labelArr[i7 + readUnsignedShort14], readUnsignedShort16);
                                    methodVisitor2 = methodVisitor;
                                    classReader3 = classReader3;
                                    readUnsignedShort13 = i92;
                                    i91 = i93;
                                    i87 = 0;
                                }
                            }
                        }
                        ClassReader classReader4 = classReader3;
                        int i95 = 65;
                        int i96 = 64;
                        if (iArr20 != null) {
                            int length = iArr20.length;
                            int i97 = 0;
                            while (i97 < length) {
                                int i98 = iArr20[i97];
                                int readByte = classReader4.readByte(i98);
                                if (readByte == 64 || readByte == i95) {
                                    int readTypeAnnotationTarget3 = classReader4.readTypeAnnotationTarget(context, i98);
                                    i6 = i97;
                                    classReader4.readElementValues(methodVisitor.visitLocalVariableAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, context.currentLocalVariableAnnotationRangeStarts, context.currentLocalVariableAnnotationRangeEnds, context.currentLocalVariableAnnotationRangeIndices, classReader4.readUTF8(readTypeAnnotationTarget3, cArr), true), readTypeAnnotationTarget3 + 2, true, cArr);
                                } else {
                                    i6 = i97;
                                }
                                i97 = i6 + 1;
                                i95 = 65;
                            }
                        }
                        if (iArr21 != null) {
                            int length2 = iArr21.length;
                            int i99 = 0;
                            while (i99 < length2) {
                                int i100 = iArr21[i99];
                                int readByte2 = classReader4.readByte(i100);
                                if (readByte2 == i96 || readByte2 == 65) {
                                    int readTypeAnnotationTarget4 = classReader4.readTypeAnnotationTarget(context, i100);
                                    classReader4.readElementValues(methodVisitor.visitLocalVariableAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, context.currentLocalVariableAnnotationRangeStarts, context.currentLocalVariableAnnotationRangeEnds, context.currentLocalVariableAnnotationRangeIndices, classReader4.readUTF8(readTypeAnnotationTarget4, cArr), false), readTypeAnnotationTarget4 + 2, true, cArr);
                                }
                                i99++;
                                i96 = 64;
                            }
                        }
                        Attribute attribute4 = attribute;
                        while (attribute4 != null) {
                            Attribute attribute5 = attribute4.nextAttribute;
                            attribute4.nextAttribute = null;
                            methodVisitor.visitAttribute(attribute4);
                            attribute4 = attribute5;
                        }
                        methodVisitor.visitMaxs(i86, i85);
                        return;
                    }
                }
            }
        }
    }

    protected Label readLabel(int i, Label[] labelArr) {
        if (labelArr[i] == null) {
            labelArr[i] = new Label();
        }
        return labelArr[i];
    }

    private Label createLabel(int i, Label[] labelArr) {
        Label readLabel = readLabel(i, labelArr);
        readLabel.flags = (short) (readLabel.flags & (-2));
        return readLabel;
    }

    private void createDebugLabel(int i, Label[] labelArr) {
        if (labelArr[i] == null) {
            Label readLabel = readLabel(i, labelArr);
            readLabel.flags = (short) (readLabel.flags | 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int[] readTypeAnnotations(MethodVisitor methodVisitor, Context context, int i, boolean z) {
        int i2;
        char[] cArr = context.charBuffer;
        int readUnsignedShort = readUnsignedShort(i);
        int[] iArr = new int[readUnsignedShort];
        int i3 = i + 2;
        for (int i4 = 0; i4 < readUnsignedShort; i4++) {
            iArr[i4] = i3;
            int readInt = readInt(i3);
            int i5 = readInt >>> 24;
            if (i5 != 23) {
                switch (i5) {
                    default:
                        switch (i5) {
                            case 64:
                            case 65:
                                int readUnsignedShort2 = readUnsignedShort(i3 + 1);
                                i2 = i3 + 3;
                                while (true) {
                                    int i6 = readUnsignedShort2 - 1;
                                    if (readUnsignedShort2 <= 0) {
                                        break;
                                    } else {
                                        int readUnsignedShort3 = readUnsignedShort(i2);
                                        int readUnsignedShort4 = readUnsignedShort(i2 + 2);
                                        i2 += 6;
                                        createLabel(readUnsignedShort3, context.currentMethodLabels);
                                        createLabel(readUnsignedShort3 + readUnsignedShort4, context.currentMethodLabels);
                                        readUnsignedShort2 = i6;
                                    }
                                }
                            case 66:
                            case 67:
                            case 68:
                            case 69:
                            case 70:
                                break;
                            case 71:
                            case 72:
                            case 73:
                            case 74:
                            case 75:
                                i2 = i3 + 4;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        int readByte = readByte(i2);
                        if (i5 == 66) {
                            TypePath typePath = readByte != 0 ? new TypePath(this.classFileBuffer, i2) : null;
                            int i7 = i2 + (readByte * 2) + 1;
                            i3 = readElementValues(methodVisitor.visitTryCatchAnnotation(readInt & (-256), typePath, readUTF8(i7, cArr), z), i7 + 2, true, cArr);
                        } else {
                            i3 = readElementValues(null, i2 + (readByte * 2) + 3, true, cArr);
                        }
                    case 16:
                    case 17:
                    case 18:
                        i2 = i3 + 3;
                        int readByte2 = readByte(i2);
                        if (i5 == 66) {
                        }
                        break;
                }
            }
            i2 = i3 + 3;
            int readByte22 = readByte(i2);
            if (i5 == 66) {
            }
        }
        return iArr;
    }

    private int getTypeAnnotationBytecodeOffset(int[] iArr, int i) {
        if (iArr == null || i >= iArr.length || readByte(iArr[i]) < 67) {
            return -1;
        }
        return readUnsignedShort(iArr[i] + 1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int readTypeAnnotationTarget(Context context, int i) {
        int i2;
        int i3;
        int readInt = readInt(i);
        int i4 = readInt >>> 24;
        if (i4 != 0 && i4 != 1) {
            switch (i4) {
                case 16:
                case 17:
                case 18:
                case 23:
                    i2 = readInt & (-256);
                    i3 = i + 3;
                    context.currentTypeAnnotationTarget = i2;
                    int readByte = readByte(i3);
                    context.currentTypeAnnotationTargetPath = readByte != 0 ? null : new TypePath(this.classFileBuffer, i3);
                    return i3 + 1 + (readByte * 2);
                case 19:
                case 20:
                case 21:
                    i2 = readInt & ViewCompat.MEASURED_STATE_MASK;
                    i3 = i + 1;
                    context.currentTypeAnnotationTarget = i2;
                    int readByte2 = readByte(i3);
                    context.currentTypeAnnotationTargetPath = readByte2 != 0 ? null : new TypePath(this.classFileBuffer, i3);
                    return i3 + 1 + (readByte2 * 2);
                case 22:
                    break;
                default:
                    switch (i4) {
                        case 64:
                        case 65:
                            i2 = readInt & ViewCompat.MEASURED_STATE_MASK;
                            int readUnsignedShort = readUnsignedShort(i + 1);
                            i3 = i + 3;
                            context.currentLocalVariableAnnotationRangeStarts = new Label[readUnsignedShort];
                            context.currentLocalVariableAnnotationRangeEnds = new Label[readUnsignedShort];
                            context.currentLocalVariableAnnotationRangeIndices = new int[readUnsignedShort];
                            for (int i5 = 0; i5 < readUnsignedShort; i5++) {
                                int readUnsignedShort2 = readUnsignedShort(i3);
                                int readUnsignedShort3 = readUnsignedShort(i3 + 2);
                                int readUnsignedShort4 = readUnsignedShort(i3 + 4);
                                i3 += 6;
                                context.currentLocalVariableAnnotationRangeStarts[i5] = createLabel(readUnsignedShort2, context.currentMethodLabels);
                                context.currentLocalVariableAnnotationRangeEnds[i5] = createLabel(readUnsignedShort2 + readUnsignedShort3, context.currentMethodLabels);
                                context.currentLocalVariableAnnotationRangeIndices[i5] = readUnsignedShort4;
                            }
                            context.currentTypeAnnotationTarget = i2;
                            int readByte22 = readByte(i3);
                            context.currentTypeAnnotationTargetPath = readByte22 != 0 ? null : new TypePath(this.classFileBuffer, i3);
                            return i3 + 1 + (readByte22 * 2);
                        case 66:
                            break;
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                            i2 = readInt & ViewCompat.MEASURED_STATE_MASK;
                            i3 = i + 3;
                            context.currentTypeAnnotationTarget = i2;
                            int readByte222 = readByte(i3);
                            context.currentTypeAnnotationTargetPath = readByte222 != 0 ? null : new TypePath(this.classFileBuffer, i3);
                            return i3 + 1 + (readByte222 * 2);
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                            i2 = readInt & (-16776961);
                            i3 = i + 4;
                            context.currentTypeAnnotationTarget = i2;
                            int readByte2222 = readByte(i3);
                            context.currentTypeAnnotationTargetPath = readByte2222 != 0 ? null : new TypePath(this.classFileBuffer, i3);
                            return i3 + 1 + (readByte2222 * 2);
                        default:
                            throw new IllegalArgumentException();
                    }
            }
        }
        i2 = readInt & (-65536);
        i3 = i + 2;
        context.currentTypeAnnotationTarget = i2;
        int readByte22222 = readByte(i3);
        context.currentTypeAnnotationTargetPath = readByte22222 != 0 ? null : new TypePath(this.classFileBuffer, i3);
        return i3 + 1 + (readByte22222 * 2);
    }

    private void readParameterAnnotations(MethodVisitor methodVisitor, Context context, int i, boolean z) {
        int i2 = i + 1;
        int i3 = this.classFileBuffer[i] & 255;
        methodVisitor.visitAnnotableParameterCount(i3, z);
        char[] cArr = context.charBuffer;
        for (int i4 = 0; i4 < i3; i4++) {
            int readUnsignedShort = readUnsignedShort(i2);
            i2 += 2;
            while (true) {
                int i5 = readUnsignedShort - 1;
                if (readUnsignedShort > 0) {
                    i2 = readElementValues(methodVisitor.visitParameterAnnotation(i4, readUTF8(i2, cArr), z), i2 + 2, true, cArr);
                    readUnsignedShort = i5;
                }
            }
        }
    }

    private int readElementValues(AnnotationVisitor annotationVisitor, int i, boolean z, char[] cArr) {
        int readUnsignedShort = readUnsignedShort(i);
        int i2 = i + 2;
        if (!z) {
            while (true) {
                int i3 = readUnsignedShort - 1;
                if (readUnsignedShort <= 0) {
                    break;
                }
                i2 = readElementValue(annotationVisitor, i2, null, cArr);
                readUnsignedShort = i3;
            }
        } else {
            while (true) {
                int i4 = readUnsignedShort - 1;
                if (readUnsignedShort <= 0) {
                    break;
                }
                i2 = readElementValue(annotationVisitor, i2 + 2, readUTF8(i2, cArr), cArr);
                readUnsignedShort = i4;
            }
        }
        if (annotationVisitor != null) {
            annotationVisitor.visitEnd();
        }
        return i2;
    }

    private int readElementValue(AnnotationVisitor annotationVisitor, int i, String str, char[] cArr) {
        Object obj;
        int i2 = 0;
        if (annotationVisitor == null) {
            int i3 = this.classFileBuffer[i] & 255;
            if (i3 == 64) {
                return readElementValues(null, i + 3, true, cArr);
            }
            if (i3 != 91) {
                return i3 != 101 ? i + 3 : i + 5;
            }
            return readElementValues(null, i + 1, false, cArr);
        }
        int i4 = i + 1;
        int i5 = this.classFileBuffer[i] & 255;
        if (i5 != 64) {
            if (i5 != 70) {
                if (i5 == 83) {
                    annotationVisitor.visit(str, Short.valueOf((short) readInt(this.cpInfoOffsets[readUnsignedShort(i4)])));
                    return i + 3;
                }
                if (i5 == 99) {
                    annotationVisitor.visit(str, Type.getType(readUTF8(i4, cArr)));
                    return i + 3;
                }
                if (i5 == 101) {
                    annotationVisitor.visitEnum(str, readUTF8(i4, cArr), readUTF8(i + 3, cArr));
                    return i + 5;
                }
                if (i5 == 115) {
                    annotationVisitor.visit(str, readUTF8(i4, cArr));
                    return i + 3;
                }
                if (i5 != 73 && i5 != 74) {
                    if (i5 == 90) {
                        if (readInt(this.cpInfoOffsets[readUnsignedShort(i4)]) == 0) {
                            obj = Boolean.FALSE;
                        } else {
                            obj = Boolean.TRUE;
                        }
                        annotationVisitor.visit(str, obj);
                        return i + 3;
                    }
                    if (i5 != 91) {
                        switch (i5) {
                            case 66:
                                annotationVisitor.visit(str, Byte.valueOf((byte) readInt(this.cpInfoOffsets[readUnsignedShort(i4)])));
                                return i + 3;
                            case 67:
                                annotationVisitor.visit(str, Character.valueOf((char) readInt(this.cpInfoOffsets[readUnsignedShort(i4)])));
                                return i + 3;
                            case 68:
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    } else {
                        int readUnsignedShort = readUnsignedShort(i4);
                        int i6 = i + 3;
                        if (readUnsignedShort == 0) {
                            return readElementValues(annotationVisitor.visitArray(str), i + 1, false, cArr);
                        }
                        int i7 = this.classFileBuffer[i6] & 255;
                        if (i7 == 70) {
                            float[] fArr = new float[readUnsignedShort];
                            while (i2 < readUnsignedShort) {
                                fArr[i2] = Float.intBitsToFloat(readInt(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]));
                                i6 += 3;
                                i2++;
                            }
                            annotationVisitor.visit(str, fArr);
                            return i6;
                        }
                        if (i7 == 83) {
                            short[] sArr = new short[readUnsignedShort];
                            while (i2 < readUnsignedShort) {
                                sArr[i2] = (short) readInt(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]);
                                i6 += 3;
                                i2++;
                            }
                            annotationVisitor.visit(str, sArr);
                            return i6;
                        }
                        if (i7 == 90) {
                            boolean[] zArr = new boolean[readUnsignedShort];
                            for (int i8 = 0; i8 < readUnsignedShort; i8++) {
                                zArr[i8] = readInt(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]) != 0;
                                i6 += 3;
                            }
                            annotationVisitor.visit(str, zArr);
                            return i6;
                        }
                        if (i7 == 73) {
                            int[] iArr = new int[readUnsignedShort];
                            while (i2 < readUnsignedShort) {
                                iArr[i2] = readInt(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]);
                                i6 += 3;
                                i2++;
                            }
                            annotationVisitor.visit(str, iArr);
                            return i6;
                        }
                        if (i7 != 74) {
                            switch (i7) {
                                case 66:
                                    byte[] bArr = new byte[readUnsignedShort];
                                    while (i2 < readUnsignedShort) {
                                        bArr[i2] = (byte) readInt(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]);
                                        i6 += 3;
                                        i2++;
                                    }
                                    annotationVisitor.visit(str, bArr);
                                    return i6;
                                case 67:
                                    char[] cArr2 = new char[readUnsignedShort];
                                    while (i2 < readUnsignedShort) {
                                        cArr2[i2] = (char) readInt(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]);
                                        i6 += 3;
                                        i2++;
                                    }
                                    annotationVisitor.visit(str, cArr2);
                                    return i6;
                                case 68:
                                    double[] dArr = new double[readUnsignedShort];
                                    while (i2 < readUnsignedShort) {
                                        dArr[i2] = Double.longBitsToDouble(readLong(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]));
                                        i6 += 3;
                                        i2++;
                                    }
                                    annotationVisitor.visit(str, dArr);
                                    return i6;
                                default:
                                    return readElementValues(annotationVisitor.visitArray(str), i + 1, false, cArr);
                            }
                        }
                        long[] jArr = new long[readUnsignedShort];
                        while (i2 < readUnsignedShort) {
                            jArr[i2] = readLong(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]);
                            i6 += 3;
                            i2++;
                        }
                        annotationVisitor.visit(str, jArr);
                        return i6;
                    }
                }
            }
            annotationVisitor.visit(str, readConst(readUnsignedShort(i4), cArr));
            return i + 3;
        }
        return readElementValues(annotationVisitor.visitAnnotation(str, readUTF8(i4, cArr)), i + 3, true, cArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0050, code lost:
    
        r11.currentFrameLocalCount = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0052, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void computeImplicitFrame(Context context) {
        int i;
        String str = context.currentMethodDescriptor;
        Object[] objArr = context.currentFrameLocalTypes;
        int i2 = 0;
        if ((context.currentMethodAccessFlags & 8) == 0) {
            if ("<init>".equals(context.currentMethodName)) {
                objArr[0] = Opcodes.UNINITIALIZED_THIS;
            } else {
                objArr[0] = readClass(this.header + 2, context.charBuffer);
            }
            i2 = 1;
        }
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt = str.charAt(i3);
            if (charAt == 'F') {
                i = i2 + 1;
                objArr[i2] = Opcodes.FLOAT;
            } else if (charAt != 'L') {
                if (charAt != 'S' && charAt != 'I') {
                    if (charAt == 'J') {
                        i = i2 + 1;
                        objArr[i2] = Opcodes.LONG;
                    } else if (charAt != 'Z') {
                        if (charAt != '[') {
                            switch (charAt) {
                                case 'D':
                                    i = i2 + 1;
                                    objArr[i2] = Opcodes.DOUBLE;
                                    break;
                            }
                        } else {
                            while (str.charAt(i4) == '[') {
                                i4++;
                            }
                            if (str.charAt(i4) == 'L') {
                                do {
                                    i4++;
                                } while (str.charAt(i4) != ';');
                            }
                            int i5 = i4 + 1;
                            objArr[i2] = str.substring(i3, i5);
                            i3 = i5;
                            i2++;
                        }
                    }
                }
                i = i2 + 1;
                objArr[i2] = Opcodes.INTEGER;
            } else {
                int i6 = i4;
                while (str.charAt(i6) != ';') {
                    i6++;
                }
                objArr[i2] = str.substring(i4, i6);
                i2++;
                i3 = i6 + 1;
            }
            i2 = i;
            i3 = i4;
        }
    }

    private int readStackMapFrame(int i, boolean z, boolean z2, Context context) {
        int i2;
        int i3;
        char[] cArr = context.charBuffer;
        Label[] labelArr = context.currentMethodLabels;
        if (z) {
            i2 = i + 1;
            i3 = this.classFileBuffer[i] & 255;
        } else {
            context.currentFrameOffset = -1;
            i2 = i;
            i3 = 255;
        }
        context.currentFrameLocalCountDelta = 0;
        if (i3 < 64) {
            context.currentFrameType = 3;
            context.currentFrameStackCount = 0;
        } else if (i3 < 128) {
            i3 -= 64;
            i2 = readVerificationTypeInfo(i2, context.currentFrameStackTypes, 0, cArr, labelArr);
            context.currentFrameType = 4;
            context.currentFrameStackCount = 1;
        } else if (i3 >= 247) {
            int readUnsignedShort = readUnsignedShort(i2);
            int i4 = i2;
            i2 = i4 + 2;
            if (i3 == 247) {
                i2 = readVerificationTypeInfo(i2, context.currentFrameStackTypes, 0, cArr, labelArr);
                context.currentFrameType = 4;
                context.currentFrameStackCount = 1;
            } else if (i3 >= 248 && i3 < 251) {
                context.currentFrameType = 2;
                context.currentFrameLocalCountDelta = 251 - i3;
                context.currentFrameLocalCount -= context.currentFrameLocalCountDelta;
                context.currentFrameStackCount = 0;
            } else if (i3 == 251) {
                context.currentFrameType = 3;
                context.currentFrameStackCount = 0;
            } else if (i3 < 255) {
                int i5 = i3 - 251;
                int i6 = z2 ? context.currentFrameLocalCount : 0;
                int i7 = i5;
                while (i7 > 0) {
                    i2 = readVerificationTypeInfo(i2, context.currentFrameLocalTypes, i6, cArr, labelArr);
                    i7--;
                    i6++;
                }
                context.currentFrameType = 1;
                context.currentFrameLocalCountDelta = i5;
                context.currentFrameLocalCount += context.currentFrameLocalCountDelta;
                context.currentFrameStackCount = 0;
            } else {
                int readUnsignedShort2 = readUnsignedShort(i2);
                int i8 = i4 + 4;
                context.currentFrameType = 0;
                context.currentFrameLocalCountDelta = readUnsignedShort2;
                context.currentFrameLocalCount = readUnsignedShort2;
                for (int i9 = 0; i9 < readUnsignedShort2; i9++) {
                    i8 = readVerificationTypeInfo(i8, context.currentFrameLocalTypes, i9, cArr, labelArr);
                }
                int readUnsignedShort3 = readUnsignedShort(i8);
                i2 = i8 + 2;
                context.currentFrameStackCount = readUnsignedShort3;
                for (int i10 = 0; i10 < readUnsignedShort3; i10++) {
                    i2 = readVerificationTypeInfo(i2, context.currentFrameStackTypes, i10, cArr, labelArr);
                }
            }
            i3 = readUnsignedShort;
        } else {
            throw new IllegalArgumentException();
        }
        context.currentFrameOffset += i3 + 1;
        createLabel(context.currentFrameOffset, labelArr);
        return i2;
    }

    private int readVerificationTypeInfo(int i, Object[] objArr, int i2, char[] cArr, Label[] labelArr) {
        int i3 = i + 1;
        switch (this.classFileBuffer[i] & 255) {
            case 0:
                objArr[i2] = Opcodes.TOP;
                return i3;
            case 1:
                objArr[i2] = Opcodes.INTEGER;
                return i3;
            case 2:
                objArr[i2] = Opcodes.FLOAT;
                return i3;
            case 3:
                objArr[i2] = Opcodes.DOUBLE;
                return i3;
            case 4:
                objArr[i2] = Opcodes.LONG;
                return i3;
            case 5:
                objArr[i2] = Opcodes.NULL;
                return i3;
            case 6:
                objArr[i2] = Opcodes.UNINITIALIZED_THIS;
                return i3;
            case 7:
                objArr[i2] = readClass(i3, cArr);
                break;
            case 8:
                objArr[i2] = createLabel(readUnsignedShort(i3), labelArr);
                break;
            default:
                throw new IllegalArgumentException();
        }
        return i + 3;
    }

    final int getFirstAttributeOffset() {
        int i = this.header;
        int readUnsignedShort = i + 8 + (readUnsignedShort(i + 6) * 2);
        int readUnsignedShort2 = readUnsignedShort(readUnsignedShort);
        int i2 = readUnsignedShort + 2;
        while (true) {
            int i3 = readUnsignedShort2 - 1;
            if (readUnsignedShort2 <= 0) {
                break;
            }
            int readUnsignedShort3 = readUnsignedShort(i2 + 6);
            i2 += 8;
            while (true) {
                int i4 = readUnsignedShort3 - 1;
                if (readUnsignedShort3 > 0) {
                    i2 += readInt(i2 + 2) + 6;
                    readUnsignedShort3 = i4;
                }
            }
            readUnsignedShort2 = i3;
        }
        int readUnsignedShort4 = readUnsignedShort(i2);
        int i5 = i2 + 2;
        while (true) {
            int i6 = readUnsignedShort4 - 1;
            if (readUnsignedShort4 <= 0) {
                return i5 + 2;
            }
            int readUnsignedShort5 = readUnsignedShort(i5 + 6);
            i5 += 8;
            while (true) {
                int i7 = readUnsignedShort5 - 1;
                if (readUnsignedShort5 > 0) {
                    i5 += readInt(i5 + 2) + 6;
                    readUnsignedShort5 = i7;
                }
            }
            readUnsignedShort4 = i6;
        }
    }

    private int[] readBootstrapMethodsAttribute(int i) {
        char[] cArr = new char[i];
        int firstAttributeOffset = getFirstAttributeOffset();
        for (int readUnsignedShort = readUnsignedShort(firstAttributeOffset - 2); readUnsignedShort > 0; readUnsignedShort--) {
            String readUTF8 = readUTF8(firstAttributeOffset, cArr);
            int readInt = readInt(firstAttributeOffset + 2);
            int i2 = firstAttributeOffset + 6;
            if ("BootstrapMethods".equals(readUTF8)) {
                int readUnsignedShort2 = readUnsignedShort(i2);
                int[] iArr = new int[readUnsignedShort2];
                int i3 = firstAttributeOffset + 8;
                for (int i4 = 0; i4 < readUnsignedShort2; i4++) {
                    iArr[i4] = i3;
                    i3 += (readUnsignedShort(i3 + 2) * 2) + 4;
                }
                return iArr;
            }
            firstAttributeOffset = i2 + readInt;
        }
        throw new IllegalArgumentException();
    }

    private Attribute readAttribute(Attribute[] attributeArr, String str, int i, int i2, char[] cArr, int i3, Label[] labelArr) {
        for (Attribute attribute : attributeArr) {
            if (attribute.type.equals(str)) {
                return attribute.read(this, i, i2, cArr, i3, labelArr);
            }
        }
        return new Attribute(str).read(this, i, i2, null, -1, null);
    }

    public int getItemCount() {
        return this.cpInfoOffsets.length;
    }

    public int getItem(int i) {
        return this.cpInfoOffsets[i];
    }

    public int getMaxStringLength() {
        return this.maxStringLength;
    }

    public int readByte(int i) {
        return this.classFileBuffer[i] & 255;
    }

    public int readUnsignedShort(int i) {
        byte[] bArr = this.classFileBuffer;
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }

    public short readShort(int i) {
        byte[] bArr = this.classFileBuffer;
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    public int readInt(int i) {
        byte[] bArr = this.classFileBuffer;
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public long readLong(int i) {
        return (readInt(i) << 32) | (readInt(i + 4) & 4294967295L);
    }

    public String readUTF8(int i, char[] cArr) {
        int readUnsignedShort = readUnsignedShort(i);
        if (i == 0 || readUnsignedShort == 0) {
            return null;
        }
        return readUtf(readUnsignedShort, cArr);
    }

    final String readUtf(int i, char[] cArr) {
        String[] strArr = this.constantUtf8Values;
        String str = strArr[i];
        if (str != null) {
            return str;
        }
        int i2 = this.cpInfoOffsets[i];
        String readUtf = readUtf(i2 + 2, readUnsignedShort(i2), cArr);
        strArr[i] = readUtf;
        return readUtf;
    }

    private String readUtf(int i, int i2, char[] cArr) {
        int i3;
        int i4 = i2 + i;
        byte[] bArr = this.classFileBuffer;
        int i5 = 0;
        while (i < i4) {
            int i6 = i + 1;
            byte b = bArr[i];
            if ((b & 128) == 0) {
                cArr[i5] = (char) (b & Byte.MAX_VALUE);
                i5++;
                i = i6;
            } else {
                if ((b & MessagePack.Code.NEGFIXINT_PREFIX) == 192) {
                    i3 = i5 + 1;
                    i += 2;
                    cArr[i5] = (char) (((b & 31) << 6) + (bArr[i6] & 63));
                } else {
                    i3 = i5 + 1;
                    int i7 = i + 2;
                    i += 3;
                    cArr[i5] = (char) (((b & 15) << 12) + ((bArr[i6] & 63) << 6) + (bArr[i7] & 63));
                }
                i5 = i3;
            }
        }
        return new String(cArr, 0, i5);
    }

    private String readStringish(int i, char[] cArr) {
        return readUTF8(this.cpInfoOffsets[readUnsignedShort(i)], cArr);
    }

    public String readClass(int i, char[] cArr) {
        return readStringish(i, cArr);
    }

    public String readModule(int i, char[] cArr) {
        return readStringish(i, cArr);
    }

    public String readPackage(int i, char[] cArr) {
        return readStringish(i, cArr);
    }

    private ConstantDynamic readConstantDynamic(int i, char[] cArr) {
        ConstantDynamic constantDynamic = this.constantDynamicValues[i];
        if (constantDynamic != null) {
            return constantDynamic;
        }
        int[] iArr = this.cpInfoOffsets;
        int i2 = iArr[i];
        int i3 = iArr[readUnsignedShort(i2 + 2)];
        String readUTF8 = readUTF8(i3, cArr);
        String readUTF82 = readUTF8(i3 + 2, cArr);
        int i4 = this.bootstrapMethodOffsets[readUnsignedShort(i2)];
        Handle handle = (Handle) readConst(readUnsignedShort(i4), cArr);
        int readUnsignedShort = readUnsignedShort(i4 + 2);
        Object[] objArr = new Object[readUnsignedShort];
        int i5 = i4 + 4;
        for (int i6 = 0; i6 < readUnsignedShort; i6++) {
            objArr[i6] = readConst(readUnsignedShort(i5), cArr);
            i5 += 2;
        }
        ConstantDynamic[] constantDynamicArr = this.constantDynamicValues;
        ConstantDynamic constantDynamic2 = new ConstantDynamic(readUTF8, readUTF82, handle, objArr);
        constantDynamicArr[i] = constantDynamic2;
        return constantDynamic2;
    }

    public Object readConst(int i, char[] cArr) {
        int i2 = this.cpInfoOffsets[i];
        byte b = this.classFileBuffer[i2 - 1];
        switch (b) {
            case 3:
                return Integer.valueOf(readInt(i2));
            case 4:
                return Float.valueOf(Float.intBitsToFloat(readInt(i2)));
            case 5:
                return Long.valueOf(readLong(i2));
            case 6:
                return Double.valueOf(Double.longBitsToDouble(readLong(i2)));
            case 7:
                return Type.getObjectType(readUTF8(i2, cArr));
            case 8:
                return readUTF8(i2, cArr);
            default:
                switch (b) {
                    case 15:
                        int readByte = readByte(i2);
                        int i3 = this.cpInfoOffsets[readUnsignedShort(i2 + 1)];
                        int i4 = this.cpInfoOffsets[readUnsignedShort(i3 + 2)];
                        return new Handle(readByte, readClass(i3, cArr), readUTF8(i4, cArr), readUTF8(i4 + 2, cArr), this.classFileBuffer[i3 - 1] == 11);
                    case 16:
                        return Type.getMethodType(readUTF8(i2, cArr));
                    case 17:
                        return readConstantDynamic(i, cArr);
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }
}
