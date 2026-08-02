package com.googlecode.mp4parser.boxes.microsoft;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.googlecode.mp4parser.AbstractBox;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Iterator;
import java.util.Vector;
import xsna.n0y;
import xsna.o0y;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes13.dex */
public class XtraBox extends AbstractBox {
    private static final long FILETIME_EPOCH_DIFF = 11644473600000L;
    private static final long FILETIME_ONE_MILLISECOND = 10000;
    public static final int MP4_XTRA_BT_FILETIME = 21;
    public static final int MP4_XTRA_BT_GUID = 72;
    public static final int MP4_XTRA_BT_INT64 = 19;
    public static final int MP4_XTRA_BT_UNICODE = 8;
    public static final String TYPE = "Xtra";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_10 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private static final /* synthetic */ n0y ajc$tjp_3 = null;
    private static final /* synthetic */ n0y ajc$tjp_4 = null;
    private static final /* synthetic */ n0y ajc$tjp_5 = null;
    private static final /* synthetic */ n0y ajc$tjp_6 = null;
    private static final /* synthetic */ n0y ajc$tjp_7 = null;
    private static final /* synthetic */ n0y ajc$tjp_8 = null;
    private static final /* synthetic */ n0y ajc$tjp_9 = null;
    ByteBuffer data;
    private boolean successfulParse;
    Vector<a> tags;

    public static class b {
        public int a;
        public String b;
        public long c;
        public byte[] d;
        public Date e;

        public final int a() {
            int i = this.a;
            if (i == 8) {
                return (this.b.length() * 2) + 8;
            }
            if (i == 19 || i == 21) {
                return 14;
            }
            return this.d.length + 6;
        }

        public final String toString() {
            int i = this.a;
            if (i == 8) {
                return "[string]" + this.b;
            }
            if (i == 19) {
                return "[long]" + String.valueOf(this.c);
            }
            if (i != 21) {
                return "[GUID](nonParsed)";
            }
            return "[filetime]" + this.e.toString();
        }
    }

    static {
        ajc$preClinit();
    }

    public XtraBox() {
        super(TYPE);
        this.successfulParse = false;
        this.tags = new Vector<>();
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("XtraBox.java", XtraBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("toString", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "", "", "", "java.lang.String"));
        ajc$tjp_1 = whqVar.f(whqVar.e("getAllTagNames", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "", "", "", "[Ljava.lang.String;"));
        ajc$tjp_10 = whqVar.f(whqVar.e("setTagValue", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String:long", "name:value", "", "void"));
        ajc$tjp_2 = whqVar.f(whqVar.e("getFirstStringValue", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String", "name", "", "java.lang.String"));
        ajc$tjp_3 = whqVar.f(whqVar.e("getFirstDateValue", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String", "name", "", "java.util.Date"));
        ajc$tjp_4 = whqVar.f(whqVar.e("getFirstLongValue", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String", "name", "", "java.lang.Long"));
        ajc$tjp_5 = whqVar.f(whqVar.e("getValues", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String", "name", "", "[Ljava.lang.Object;"));
        ajc$tjp_6 = whqVar.f(whqVar.e("removeTag", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String", "name", "", "void"));
        ajc$tjp_7 = whqVar.f(whqVar.e("setTagValues", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String:[Ljava.lang.String;", "name:values", "", "void"));
        ajc$tjp_8 = whqVar.f(whqVar.e("setTagValue", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String:java.lang.String", "name:value", "", "void"));
        ajc$tjp_9 = whqVar.f(whqVar.e("setTagValue", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String:java.util.Date", "name:date", "", "void"));
    }

    private int detailSize() {
        int i = 0;
        for (int i2 = 0; i2 < this.tags.size(); i2++) {
            i += this.tags.elementAt(i2).b();
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long filetimeToMillis(long j) {
        return (j / 10000) - FILETIME_EPOCH_DIFF;
    }

    private a getTagByName(String str) {
        Iterator<a> it = this.tags.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.b.equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long millisToFiletime(long j) {
        return (j + FILETIME_EPOCH_DIFF) * 10000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String readAsciiString(ByteBuffer byteBuffer, int i) {
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        try {
            return new String(bArr, C.ASCII_NAME);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Shouldn't happen", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String readUtf16String(ByteBuffer byteBuffer, int i) {
        int i2 = (i / 2) - 1;
        char[] cArr = new char[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            cArr[i3] = byteBuffer.getChar();
        }
        byteBuffer.getChar();
        return new String(cArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void writeAsciiString(ByteBuffer byteBuffer, String str) {
        try {
            byteBuffer.put(str.getBytes(C.ASCII_NAME));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Shouldn't happen", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void writeUtf16String(ByteBuffer byteBuffer, String str) {
        for (char c : str.toCharArray()) {
            byteBuffer.putChar(c);
        }
        byteBuffer.putChar((char) 0);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        int detailSize;
        int remaining = byteBuffer.remaining();
        this.data = byteBuffer.slice();
        this.successfulParse = false;
        try {
            try {
                this.tags.clear();
                while (byteBuffer.remaining() > 0) {
                    a aVar = new a();
                    a.a(aVar, byteBuffer);
                    this.tags.addElement(aVar);
                }
                detailSize = detailSize();
            } catch (Exception e) {
                this.successfulParse = false;
                System.err.println("Malformed Xtra Tag detected: " + e.toString());
                e.printStackTrace();
                byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
            }
            if (remaining == detailSize) {
                this.successfulParse = true;
                return;
            }
            throw new RuntimeException("Improperly handled Xtra tag: Calculated sizes don't match ( " + remaining + DomExceptionUtils.SEPARATOR + detailSize + ")");
        } finally {
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }
    }

    public String[] getAllTagNames() {
        o0y c = whq.c(ajc$tjp_1, this, this);
        w8g0.a();
        w8g0.b(c);
        String[] strArr = new String[this.tags.size()];
        for (int i = 0; i < this.tags.size(); i++) {
            strArr[i] = this.tags.elementAt(i).b;
        }
        return strArr;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        if (!this.successfulParse) {
            this.data.rewind();
            byteBuffer.put(this.data);
            return;
        }
        for (int i = 0; i < this.tags.size(); i++) {
            a elementAt = this.tags.elementAt(i);
            byteBuffer.putInt(elementAt.b());
            byteBuffer.putInt(elementAt.b.length());
            writeAsciiString(byteBuffer, elementAt.b);
            Vector<b> vector = elementAt.c;
            byteBuffer.putInt(vector.size());
            for (int i2 = 0; i2 < vector.size(); i2++) {
                b elementAt2 = vector.elementAt(i2);
                elementAt2.getClass();
                try {
                    byteBuffer.putInt(elementAt2.a());
                    byteBuffer.putShort((short) elementAt2.a);
                    byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                    int i3 = elementAt2.a;
                    if (i3 == 8) {
                        writeUtf16String(byteBuffer, elementAt2.b);
                    } else if (i3 == 19) {
                        byteBuffer.putLong(elementAt2.c);
                    } else if (i3 != 21) {
                        byteBuffer.put(elementAt2.d);
                    } else {
                        byteBuffer.putLong(millisToFiletime(elementAt2.e.getTime()));
                    }
                    byteBuffer.order(ByteOrder.BIG_ENDIAN);
                } catch (Throwable th) {
                    byteBuffer.order(ByteOrder.BIG_ENDIAN);
                    throw th;
                }
            }
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return this.successfulParse ? detailSize() : this.data.limit();
    }

    public Date getFirstDateValue(String str) {
        o0y d = whq.d(ajc$tjp_3, this, this, str);
        w8g0.a();
        w8g0.b(d);
        for (Object obj : getValues(str)) {
            if (obj instanceof Date) {
                return (Date) obj;
            }
        }
        return null;
    }

    public Long getFirstLongValue(String str) {
        o0y d = whq.d(ajc$tjp_4, this, this, str);
        w8g0.a();
        w8g0.b(d);
        for (Object obj : getValues(str)) {
            if (obj instanceof Long) {
                return (Long) obj;
            }
        }
        return null;
    }

    public String getFirstStringValue(String str) {
        o0y d = whq.d(ajc$tjp_2, this, this, str);
        w8g0.a();
        w8g0.b(d);
        for (Object obj : getValues(str)) {
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        return null;
    }

    public Object[] getValues(String str) {
        o0y d = whq.d(ajc$tjp_5, this, this, str);
        w8g0.a();
        w8g0.b(d);
        a tagByName = getTagByName(str);
        if (tagByName == null) {
            return new Object[0];
        }
        Vector<b> vector = tagByName.c;
        Object[] objArr = new Object[vector.size()];
        for (int i = 0; i < vector.size(); i++) {
            b elementAt = vector.elementAt(i);
            int i2 = elementAt.a;
            objArr[i] = i2 != 8 ? i2 != 19 ? i2 != 21 ? elementAt.d : elementAt.e : new Long(elementAt.c) : elementAt.b;
        }
        return objArr;
    }

    public void removeTag(String str) {
        o0y d = whq.d(ajc$tjp_6, this, this, str);
        w8g0.a();
        w8g0.b(d);
        a tagByName = getTagByName(str);
        if (tagByName != null) {
            this.tags.remove(tagByName);
        }
    }

    public void setTagValue(String str, long j) {
        o0y b2 = whq.b(ajc$tjp_10, this, this, str, new Long(j));
        w8g0.a();
        w8g0.b(b2);
        removeTag(str);
        a aVar = new a(str);
        b bVar = new b();
        bVar.a = 19;
        bVar.c = j;
        aVar.c.addElement(bVar);
        this.tags.addElement(aVar);
    }

    public void setTagValues(String str, String[] strArr) {
        o0y b2 = whq.b(ajc$tjp_7, this, this, str, strArr);
        w8g0.a();
        w8g0.b(b2);
        removeTag(str);
        a aVar = new a(str);
        for (String str2 : strArr) {
            b bVar = new b();
            bVar.a = 8;
            bVar.b = str2;
            aVar.c.addElement(bVar);
        }
        this.tags.addElement(aVar);
    }

    public String toString() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        if (!isParsed()) {
            parseDetails();
        }
        StringBuffer stringBuffer = new StringBuffer("XtraBox[");
        Iterator<a> it = this.tags.iterator();
        while (it.hasNext()) {
            a next = it.next();
            Iterator<b> it2 = next.c.iterator();
            while (it2.hasNext()) {
                b next2 = it2.next();
                stringBuffer.append(next.b);
                stringBuffer.append("=");
                stringBuffer.append(next2.toString());
                stringBuffer.append(";");
            }
        }
        stringBuffer.append(X3.j.e);
        return stringBuffer.toString();
    }

    public static class a {
        public int a;
        public String b;
        public final Vector<b> c;

        public a() {
            this.c = new Vector<>();
        }

        public static void a(a aVar, ByteBuffer byteBuffer) {
            aVar.a = byteBuffer.getInt();
            aVar.b = XtraBox.readAsciiString(byteBuffer, byteBuffer.getInt());
            int i = byteBuffer.getInt();
            for (int i2 = 0; i2 < i; i2++) {
                b bVar = new b();
                int i3 = byteBuffer.getInt() - 6;
                bVar.a = byteBuffer.getShort();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                int i4 = bVar.a;
                if (i4 == 8) {
                    bVar.b = XtraBox.readUtf16String(byteBuffer, i3);
                } else if (i4 == 19) {
                    bVar.c = byteBuffer.getLong();
                } else if (i4 != 21) {
                    byte[] bArr = new byte[i3];
                    bVar.d = bArr;
                    byteBuffer.get(bArr);
                } else {
                    bVar.e = new Date(XtraBox.filetimeToMillis(byteBuffer.getLong()));
                }
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
                aVar.c.addElement(bVar);
            }
            if (aVar.a == aVar.b()) {
                return;
            }
            throw new RuntimeException("Improperly handled Xtra tag: Sizes don't match ( " + aVar.a + DomExceptionUtils.SEPARATOR + aVar.b() + ") on " + aVar.b);
        }

        public final int b() {
            int length = this.b.length() + 12;
            int i = 0;
            while (true) {
                Vector<b> vector = this.c;
                if (i >= vector.size()) {
                    return length;
                }
                length += vector.elementAt(i).a();
                i++;
            }
        }

        public final String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.b);
            stringBuffer.append(" [");
            stringBuffer.append(this.a);
            stringBuffer.append(DomExceptionUtils.SEPARATOR);
            Vector<b> vector = this.c;
            stringBuffer.append(vector.size());
            stringBuffer.append("]:\n");
            for (int i = 0; i < vector.size(); i++) {
                stringBuffer.append("  ");
                stringBuffer.append(vector.elementAt(i).toString());
                stringBuffer.append("\n");
            }
            return stringBuffer.toString();
        }

        public a(String str) {
            this();
            this.b = str;
        }
    }

    public XtraBox(String str) {
        super(str);
        this.successfulParse = false;
        this.tags = new Vector<>();
    }

    public void setTagValue(String str, String str2) {
        o0y b2 = whq.b(ajc$tjp_8, this, this, str, str2);
        w8g0.a();
        w8g0.b(b2);
        setTagValues(str, new String[]{str2});
    }

    public void setTagValue(String str, Date date) {
        o0y b2 = whq.b(ajc$tjp_9, this, this, str, date);
        w8g0.a();
        w8g0.b(b2);
        removeTag(str);
        a aVar = new a(str);
        b bVar = new b();
        bVar.a = 21;
        bVar.e = date;
        aVar.c.addElement(bVar);
        this.tags.addElement(aVar);
    }
}
