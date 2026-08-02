package com.facebook.react.fabric.mounting.mountitems;

import A8.a;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.mounting.MountingManager;
import com.facebook.react.fabric.mounting.SurfaceMountingManager;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.StateWrapper;
import com.twilio.voice.EventKeys;
import com.twilio.voice.VoiceURLConnection;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;", "Lcom/facebook/react/fabric/mounting/mountitems/BatchMountItem;", "surfaceId", "", "intBuffer", "", "objBuffer", "", "", "commitNumber", "<init>", "(I[I[Ljava/lang/Object;I)V", "[Ljava/lang/Object;", "intBufferLen", "objBufferLen", "beginMarkers", "", EventKeys.REASON, "", "endMarkers", "execute", "mountingManager", "Lcom/facebook/react/fabric/mounting/MountingManager;", "getSurfaceId", "isBatchEmpty", "", "toString", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IntBufferBatchMountItem implements BatchMountItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int INSTRUCTION_CREATE = 2;
    public static final int INSTRUCTION_DELETE = 4;
    public static final int INSTRUCTION_FLAG_MULTIPLE = 1;
    public static final int INSTRUCTION_INSERT = 8;
    public static final int INSTRUCTION_REMOVE = 16;
    public static final int INSTRUCTION_UPDATE_EVENT_EMITTER = 256;
    public static final int INSTRUCTION_UPDATE_LAYOUT = 128;
    public static final int INSTRUCTION_UPDATE_OVERFLOW_INSET = 1024;
    public static final int INSTRUCTION_UPDATE_PADDING = 512;
    public static final int INSTRUCTION_UPDATE_PROPS = 32;
    public static final int INSTRUCTION_UPDATE_STATE = 64;
    private final int commitNumber;

    @NotNull
    private final int[] intBuffer;
    private final int intBufferLen;

    @NotNull
    private final Object[] objBuffer;
    private final int objBufferLen;
    private final int surfaceId;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem$Companion;", "", "<init>", "()V", "INSTRUCTION_FLAG_MULTIPLE", "", "INSTRUCTION_CREATE", "INSTRUCTION_DELETE", "INSTRUCTION_INSERT", "INSTRUCTION_REMOVE", "INSTRUCTION_UPDATE_PROPS", "INSTRUCTION_UPDATE_STATE", "INSTRUCTION_UPDATE_LAYOUT", "INSTRUCTION_UPDATE_EVENT_EMITTER", "INSTRUCTION_UPDATE_PADDING", "INSTRUCTION_UPDATE_OVERFLOW_INSET", "nameForInstructionString", "", "type", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String nameForInstructionString(int type) {
            return type != 2 ? type != 4 ? type != 8 ? type != 16 ? type != 32 ? type != 64 ? type != 128 ? type != 256 ? type != 512 ? type != 1024 ? "UNKNOWN" : "UPDATE_OVERFLOW_INSET" : "UPDATE_PADDING" : "UPDATE_EVENT_EMITTER" : "UPDATE_LAYOUT" : "UPDATE_STATE" : "UPDATE_PROPS" : "REMOVE" : "INSERT" : VoiceURLConnection.METHOD_TYPE_DELETE : "CREATE";
        }

        private Companion() {
        }
    }

    public IntBufferBatchMountItem(int i10, @NotNull int[] intBuffer, @NotNull Object[] objBuffer, int i11) {
        Intrinsics.checkNotNullParameter(intBuffer, "intBuffer");
        Intrinsics.checkNotNullParameter(objBuffer, "objBuffer");
        this.surfaceId = i10;
        this.intBuffer = intBuffer;
        this.objBuffer = objBuffer;
        this.commitNumber = i11;
        this.intBufferLen = intBuffer.length;
        this.objBufferLen = objBuffer.length;
    }

    private final void beginMarkers(String reason) {
        a.c(0L, "IntBufferBatchMountItem::" + reason);
        int i10 = this.commitNumber;
        if (i10 > 0) {
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_BATCH_EXECUTION_START, null, i10);
        }
    }

    private final void endMarkers() {
        int i10 = this.commitNumber;
        if (i10 > 0) {
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_BATCH_EXECUTION_END, null, i10);
        }
        a.i(0L);
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(@NotNull MountingManager mountingManager) {
        int i10;
        int i11;
        int i12;
        ReadableMap readableMap;
        boolean z10;
        int i13;
        int i14;
        int i15;
        Intrinsics.checkNotNullParameter(mountingManager, "mountingManager");
        SurfaceMountingManager surfaceManager = mountingManager.getSurfaceManager(this.surfaceId);
        if (surfaceManager == null) {
            E6.a.o("IntBufferBatchMountItem", "Skipping batch of MountItems; no SurfaceMountingManager found for [%d].", Integer.valueOf(this.surfaceId));
            return;
        }
        if (surfaceManager.isStopped()) {
            E6.a.o("IntBufferBatchMountItem", "Skipping batch of MountItems; was stopped [%d].", Integer.valueOf(this.surfaceId));
            return;
        }
        if (ReactNativeFeatureFlags.enableFabricLogs()) {
            E6.a.c("IntBufferBatchMountItem", "Executing IntBufferBatchMountItem on surface [%d]", Integer.valueOf(this.surfaceId));
        }
        beginMarkers("mountViews");
        int i16 = 0;
        int i17 = 0;
        while (i16 < this.intBufferLen) {
            int[] iArr = this.intBuffer;
            int i18 = i16 + 1;
            int i19 = iArr[i16];
            int i20 = i19 & (-2);
            if ((i19 & 1) != 0) {
                int i21 = iArr[i18];
                i18 = i16 + 2;
                i10 = i21;
            } else {
                i10 = 1;
            }
            int i22 = 2;
            a.d(0L, "IntBufferBatchMountItem::mountInstructions::" + INSTANCE.nameForInstructionString(i20), new String[]{"numInstructions", String.valueOf(i10)}, 2);
            int i23 = 0;
            int i24 = i17;
            while (i23 < i10) {
                if (i20 == i22) {
                    i11 = i22;
                    i12 = i23;
                    int i25 = i24 + 1;
                    String str = (String) this.objBuffer[i24];
                    if (str == null) {
                        str = "";
                    }
                    String fabricComponentName = FabricNameComponentMapping.getFabricComponentName(str);
                    int[] iArr2 = this.intBuffer;
                    int i26 = iArr2[i18];
                    Object[] objArr = this.objBuffer;
                    ReadableMap readableMap2 = (ReadableMap) objArr[i25];
                    int i27 = i24 + 3;
                    StateWrapper stateWrapper = (StateWrapper) objArr[i24 + 2];
                    i24 += 4;
                    EventEmitterWrapper eventEmitterWrapper = (EventEmitterWrapper) objArr[i27];
                    int i28 = i18 + 2;
                    if (iArr2[i18 + 1] == 1) {
                        readableMap = readableMap2;
                        z10 = true;
                    } else {
                        readableMap = readableMap2;
                        z10 = false;
                    }
                    surfaceManager.createView(fabricComponentName, i26, readableMap, stateWrapper, eventEmitterWrapper, z10);
                    i18 = i28;
                } else if (i20 == 4) {
                    i11 = i22;
                    i12 = i23;
                    surfaceManager.deleteView(this.intBuffer[i18]);
                    i18++;
                } else if (i20 == 8) {
                    i11 = i22;
                    i12 = i23;
                    int[] iArr3 = this.intBuffer;
                    int i29 = iArr3[i18];
                    int i30 = i18 + 2;
                    int i31 = iArr3[i18 + 1];
                    i18 += 3;
                    surfaceManager.addViewAt(i31, i29, iArr3[i30]);
                } else if (i20 != 16) {
                    if (i20 == 32) {
                        i11 = i22;
                        i12 = i23;
                        i13 = i18 + 1;
                        i14 = i24 + 1;
                        surfaceManager.updateProps(this.intBuffer[i18], (ReadableMap) this.objBuffer[i24]);
                    } else if (i20 == 64) {
                        i11 = i22;
                        i12 = i23;
                        i13 = i18 + 1;
                        i14 = i24 + 1;
                        surfaceManager.updateState(this.intBuffer[i18], (StateWrapper) this.objBuffer[i24]);
                    } else if (i20 == 128) {
                        int[] iArr4 = this.intBuffer;
                        i11 = i22;
                        i12 = i23;
                        surfaceManager.updateLayout(iArr4[i18], iArr4[i18 + 1], iArr4[i18 + 2], iArr4[i18 + 3], iArr4[i18 + 4], iArr4[i18 + 5], iArr4[i18 + 6], iArr4[i18 + 7]);
                        i18 += 8;
                    } else if (i20 != 256) {
                        if (i20 == 512) {
                            int[] iArr5 = this.intBuffer;
                            i15 = i18 + 5;
                            surfaceManager.updatePadding(iArr5[i18], iArr5[i18 + 1], iArr5[i18 + 2], iArr5[i18 + 3], iArr5[i18 + 4]);
                        } else {
                            if (i20 != 1024) {
                                throw new IllegalArgumentException("Invalid type argument to IntBufferBatchMountItem: " + i20 + " at index: " + i18);
                            }
                            int[] iArr6 = this.intBuffer;
                            i15 = i18 + 5;
                            surfaceManager.updateOverflowInset(iArr6[i18], iArr6[i18 + 1], iArr6[i18 + 2], iArr6[i18 + 3], iArr6[i18 + 4]);
                        }
                        i12 = i23;
                        i18 = i15;
                        i11 = i22;
                    } else {
                        int i32 = i24 + 1;
                        EventEmitterWrapper eventEmitterWrapper2 = (EventEmitterWrapper) this.objBuffer[i24];
                        if (eventEmitterWrapper2 != null) {
                            surfaceManager.updateEventEmitter(this.intBuffer[i18], eventEmitterWrapper2);
                            i24 = i32;
                            i18++;
                        } else {
                            i24 = i32;
                        }
                        i11 = i22;
                        i12 = i23;
                    }
                    i18 = i13;
                    i24 = i14;
                } else {
                    i11 = i22;
                    i12 = i23;
                    int[] iArr7 = this.intBuffer;
                    int i33 = iArr7[i18];
                    int i34 = i18 + 2;
                    int i35 = iArr7[i18 + 1];
                    i18 += 3;
                    surfaceManager.removeViewAt(i33, i35, iArr7[i34]);
                }
                i23 = i12 + 1;
                i22 = i11;
            }
            a.i(0L);
            i16 = i18;
            i17 = i24;
        }
        endMarkers();
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public int getSurfaceId() {
        return this.surfaceId;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.BatchMountItem
    public boolean isBatchEmpty() {
        return this.intBufferLen == 0;
    }

    @NotNull
    public String toString() {
        String str;
        int i10;
        int i11;
        int i12;
        String str2 = "";
        try {
            StringBuilder sb2 = new StringBuilder();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            int i13 = 1;
            String format = String.format(Locale.ROOT, "IntBufferBatchMountItem [surface:%d]:\n", Arrays.copyOf(new Object[]{Integer.valueOf(this.surfaceId)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            sb2.append(format);
            int i14 = 0;
            int i15 = 0;
            while (i14 < this.intBufferLen) {
                int[] iArr = this.intBuffer;
                int i16 = i14 + 1;
                int i17 = iArr[i14];
                int i18 = i17 & (-2);
                if ((i17 & i13) != 0) {
                    int i19 = i14 + 2;
                    i10 = iArr[i16];
                    i16 = i19;
                } else {
                    i10 = i13;
                }
                i14 = i16;
                int i20 = 0;
                while (i20 < i10) {
                    if (i18 != 2) {
                        if (i18 == 4) {
                            str = str2;
                            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                            i11 = i14 + 1;
                            String format2 = String.format(Locale.ROOT, "DELETE [%d]\n", Arrays.copyOf(new Object[]{Integer.valueOf(this.intBuffer[i14])}, 1));
                            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
                            sb2.append(format2);
                        } else if (i18 == 8) {
                            str = str2;
                            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                            Locale locale = Locale.ROOT;
                            Integer valueOf = Integer.valueOf(this.intBuffer[i14]);
                            int i21 = i14 + 2;
                            Integer valueOf2 = Integer.valueOf(this.intBuffer[i14 + 1]);
                            i14 += 3;
                            String format3 = String.format(locale, "INSERT [%d]->[%d] @%d\n", Arrays.copyOf(new Object[]{valueOf, valueOf2, Integer.valueOf(this.intBuffer[i21])}, 3));
                            Intrinsics.checkNotNullExpressionValue(format3, "format(...)");
                            sb2.append(format3);
                        } else if (i18 != 16) {
                            String str3 = "<hidden>";
                            if (i18 == 32) {
                                str = str2;
                                i12 = i15 + 1;
                                Object obj = this.objBuffer[i15];
                                if (FabricUIManager.IS_DEVELOPMENT_ENVIRONMENT && (obj == null || (str3 = obj.toString()) == null)) {
                                    str3 = "<null>";
                                }
                                StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
                                i11 = i14 + 1;
                                String format4 = String.format(Locale.ROOT, "UPDATE PROPS [%d]: %s\n", Arrays.copyOf(new Object[]{Integer.valueOf(this.intBuffer[i14]), str3}, 2));
                                Intrinsics.checkNotNullExpressionValue(format4, "format(...)");
                                sb2.append(format4);
                            } else if (i18 == 64) {
                                str = str2;
                                i12 = i15 + 1;
                                StateWrapper stateWrapper = (StateWrapper) this.objBuffer[i15];
                                if (FabricUIManager.IS_DEVELOPMENT_ENVIRONMENT && (stateWrapper == null || (str3 = stateWrapper.toString()) == null)) {
                                    str3 = "<null>";
                                }
                                StringCompanionObject stringCompanionObject5 = StringCompanionObject.INSTANCE;
                                i11 = i14 + 1;
                                String format5 = String.format(Locale.ROOT, "UPDATE STATE [%d]: %s\n", Arrays.copyOf(new Object[]{Integer.valueOf(this.intBuffer[i14]), str3}, 2));
                                Intrinsics.checkNotNullExpressionValue(format5, "format(...)");
                                sb2.append(format5);
                            } else if (i18 == 128) {
                                str = str2;
                                StringCompanionObject stringCompanionObject6 = StringCompanionObject.INSTANCE;
                                Locale locale2 = Locale.ROOT;
                                Integer valueOf3 = Integer.valueOf(this.intBuffer[i14]);
                                Integer valueOf4 = Integer.valueOf(this.intBuffer[i14 + 1]);
                                Integer valueOf5 = Integer.valueOf(this.intBuffer[i14 + 2]);
                                Integer valueOf6 = Integer.valueOf(this.intBuffer[i14 + 3]);
                                Integer valueOf7 = Integer.valueOf(this.intBuffer[i14 + 4]);
                                Integer valueOf8 = Integer.valueOf(this.intBuffer[i14 + 5]);
                                int i22 = i14 + 7;
                                Integer valueOf9 = Integer.valueOf(this.intBuffer[i14 + 6]);
                                i14 += 8;
                                String format6 = String.format(locale2, "UPDATE LAYOUT [%d]->[%d]: x:%d y:%d w:%d h:%d displayType:%d layoutDirection:%d\n", Arrays.copyOf(new Object[]{valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, Integer.valueOf(this.intBuffer[i22])}, 8));
                                Intrinsics.checkNotNullExpressionValue(format6, "format(...)");
                                sb2.append(format6);
                            } else if (i18 == 256) {
                                str = str2;
                                i15++;
                                StringCompanionObject stringCompanionObject7 = StringCompanionObject.INSTANCE;
                                i11 = i14 + 1;
                                String format7 = String.format(Locale.ROOT, "UPDATE EVENTEMITTER [%d]\n", Arrays.copyOf(new Object[]{Integer.valueOf(this.intBuffer[i14])}, 1));
                                Intrinsics.checkNotNullExpressionValue(format7, "format(...)");
                                sb2.append(format7);
                            } else if (i18 == 512) {
                                str = str2;
                                StringCompanionObject stringCompanionObject8 = StringCompanionObject.INSTANCE;
                                Locale locale3 = Locale.ROOT;
                                Integer valueOf10 = Integer.valueOf(this.intBuffer[i14]);
                                Integer valueOf11 = Integer.valueOf(this.intBuffer[i14 + 1]);
                                Integer valueOf12 = Integer.valueOf(this.intBuffer[i14 + 2]);
                                int i23 = i14 + 4;
                                Integer valueOf13 = Integer.valueOf(this.intBuffer[i14 + 3]);
                                i14 += 5;
                                String format8 = String.format(locale3, "UPDATE PADDING [%d]: top:%d right:%d bottom:%d left:%d\n", Arrays.copyOf(new Object[]{valueOf10, valueOf11, valueOf12, valueOf13, Integer.valueOf(this.intBuffer[i23])}, 5));
                                Intrinsics.checkNotNullExpressionValue(format8, "format(...)");
                                sb2.append(format8);
                            } else {
                                if (i18 != 1024) {
                                    E6.a.m("IntBufferBatchMountItem", "String so far: " + ((Object) sb2));
                                    throw new IllegalArgumentException("Invalid type argument to IntBufferBatchMountItem: " + i18 + " at index: " + i14);
                                }
                                StringCompanionObject stringCompanionObject9 = StringCompanionObject.INSTANCE;
                                Locale locale4 = Locale.ROOT;
                                Integer valueOf14 = Integer.valueOf(this.intBuffer[i14]);
                                Integer valueOf15 = Integer.valueOf(this.intBuffer[i14 + 1]);
                                Integer valueOf16 = Integer.valueOf(this.intBuffer[i14 + 2]);
                                int i24 = i14 + 4;
                                Integer valueOf17 = Integer.valueOf(this.intBuffer[i14 + 3]);
                                str = str2;
                                try {
                                    i14 += 5;
                                    String format9 = String.format(locale4, "UPDATE OVERFLOWINSET [%d]: left:%d top:%d right:%d bottom:%d\n", Arrays.copyOf(new Object[]{valueOf14, valueOf15, valueOf16, valueOf17, Integer.valueOf(this.intBuffer[i24])}, 5));
                                    Intrinsics.checkNotNullExpressionValue(format9, "format(...)");
                                    sb2.append(format9);
                                } catch (Exception e10) {
                                    e = e10;
                                    E6.a.n("IntBufferBatchMountItem", "Caught exception trying to print", e);
                                    StringBuilder sb3 = new StringBuilder();
                                    for (int i25 = 0; i25 < this.intBufferLen; i25++) {
                                        sb3.append(this.intBuffer[i25]);
                                        sb3.append(", ");
                                    }
                                    E6.a.m("IntBufferBatchMountItem", sb3.toString());
                                    for (int i26 = 0; i26 < this.objBufferLen; i26++) {
                                        Object obj2 = this.objBuffer[i26];
                                        E6.a.m("IntBufferBatchMountItem", obj2 != null ? String.valueOf(obj2) : "null");
                                    }
                                    return str;
                                }
                            }
                            i15 = i12;
                        } else {
                            str = str2;
                            StringCompanionObject stringCompanionObject10 = StringCompanionObject.INSTANCE;
                            Locale locale5 = Locale.ROOT;
                            Integer valueOf18 = Integer.valueOf(this.intBuffer[i14]);
                            int i27 = i14 + 2;
                            Integer valueOf19 = Integer.valueOf(this.intBuffer[i14 + 1]);
                            i14 += 3;
                            String format10 = String.format(locale5, "REMOVE [%d]->[%d] @%d\n", Arrays.copyOf(new Object[]{valueOf18, valueOf19, Integer.valueOf(this.intBuffer[i27])}, 3));
                            Intrinsics.checkNotNullExpressionValue(format10, "format(...)");
                            sb2.append(format10);
                        }
                        i14 = i11;
                    } else {
                        str = str2;
                        String str4 = (String) this.objBuffer[i15];
                        if (str4 == null) {
                            str4 = str;
                        }
                        String fabricComponentName = FabricNameComponentMapping.getFabricComponentName(str4);
                        i15 += 4;
                        StringCompanionObject stringCompanionObject11 = StringCompanionObject.INSTANCE;
                        Locale locale6 = Locale.ROOT;
                        int i28 = i14 + 1;
                        Integer valueOf20 = Integer.valueOf(this.intBuffer[i14]);
                        i14 += 2;
                        String format11 = String.format(locale6, "CREATE [%d] - layoutable:%d - %s\n", Arrays.copyOf(new Object[]{valueOf20, Integer.valueOf(this.intBuffer[i28]), fabricComponentName}, 3));
                        Intrinsics.checkNotNullExpressionValue(format11, "format(...)");
                        sb2.append(format11);
                    }
                    i20++;
                    str2 = str;
                    i13 = 1;
                }
            }
            String sb4 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
            return sb4;
        } catch (Exception e11) {
            e = e11;
            str = str2;
        }
    }
}
