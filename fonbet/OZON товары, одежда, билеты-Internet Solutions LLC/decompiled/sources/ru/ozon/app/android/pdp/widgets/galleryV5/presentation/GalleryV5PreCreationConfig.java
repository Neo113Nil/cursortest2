package ru.ozon.app.android.pdp.widgets.galleryV5.presentation;

import Am.C2438a;
import B0.C2454a;
import Ef0.c;
import I1.w;
import Kk.C3532b;
import Pk0.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001BÉ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\u0006\u0010\u0017\u001a\u00020\u000b\u0012\u0006\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aJÜ\u0001\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010 R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b.\u0010-R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b/\u0010-R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b\f\u00101R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b\r\u00101R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u00100\u001a\u0004\b\u000e\u00101R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b3\u0010\u001eR\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0013\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0013\u00100\u001a\u0004\b7\u00101R\u0017\u0010\u0014\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u00100\u001a\u0004\b8\u00101R\u0017\u0010\u0015\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0015\u00100\u001a\u0004\b9\u00101R\u0017\u0010\u0016\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0016\u00100\u001a\u0004\b\u0016\u00101R\u0017\u0010\u0017\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0017\u00100\u001a\u0004\b\u0017\u00101R\u0017\u0010\u0018\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0018\u00100\u001a\u0004\b\u0018\u00101¨\u0006:"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5PreCreationConfig;", "", "", "height", "width", "defaultContainersWidth", "Ljava/util/Queue;", "containerWidthQueue", "infoContainerWidth", "ugcContainerWidth", "videoContainerWidth", "", "isBigStateInfo", "isVerticalStateUgc", "isCreateOnBoarding", "", "buttonsBg", "", "icons", "hasWave", "hasVideoContent", "hasDifferentContainers", "isZoomable", "isSelect", "isSingleButton", "<init>", "(IIILjava/util/Queue;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZZZLjava/lang/String;Ljava/util/List;ZZZZZZ)V", "copy", "(IIILjava/util/Queue;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZZZLjava/lang/String;Ljava/util/List;ZZZZZZ)Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5PreCreationConfig;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getHeight", "getWidth", "getDefaultContainersWidth", "Ljava/util/Queue;", "getContainerWidthQueue", "()Ljava/util/Queue;", "Ljava/lang/Integer;", "getInfoContainerWidth", "()Ljava/lang/Integer;", "getUgcContainerWidth", "getVideoContainerWidth", "Z", "()Z", "Ljava/lang/String;", "getButtonsBg", "Ljava/util/List;", "getIcons", "()Ljava/util/List;", "getHasWave", "getHasVideoContent", "getHasDifferentContainers", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GalleryV5PreCreationConfig {
    private final String buttonsBg;
    private final Queue<Integer> containerWidthQueue;
    private final int defaultContainersWidth;
    private final boolean hasDifferentContainers;
    private final boolean hasVideoContent;
    private final boolean hasWave;
    private final int height;
    private final List<String> icons;
    private final Integer infoContainerWidth;
    private final boolean isBigStateInfo;
    private final boolean isCreateOnBoarding;
    private final boolean isSelect;
    private final boolean isSingleButton;
    private final boolean isVerticalStateUgc;
    private final boolean isZoomable;
    private final Integer ugcContainerWidth;
    private final Integer videoContainerWidth;
    private final int width;

    public GalleryV5PreCreationConfig(int i11, int i12, int i13, Queue<Integer> queue, Integer num, Integer num2, Integer num3, boolean z11, boolean z12, boolean z13, String str, List<String> list, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        this.height = i11;
        this.width = i12;
        this.defaultContainersWidth = i13;
        this.containerWidthQueue = queue;
        this.infoContainerWidth = num;
        this.ugcContainerWidth = num2;
        this.videoContainerWidth = num3;
        this.isBigStateInfo = z11;
        this.isVerticalStateUgc = z12;
        this.isCreateOnBoarding = z13;
        this.buttonsBg = str;
        this.icons = list;
        this.hasWave = z14;
        this.hasVideoContent = z15;
        this.hasDifferentContainers = z16;
        this.isZoomable = z17;
        this.isSelect = z18;
        this.isSingleButton = z19;
    }

    public static /* synthetic */ GalleryV5PreCreationConfig copy$default(GalleryV5PreCreationConfig galleryV5PreCreationConfig, int i11, int i12, int i13, Queue queue, Integer num, Integer num2, Integer num3, boolean z11, boolean z12, boolean z13, String str, List list, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i14, Object obj) {
        boolean z21;
        boolean z22;
        int i15 = (i14 & 1) != 0 ? galleryV5PreCreationConfig.height : i11;
        int i16 = (i14 & 2) != 0 ? galleryV5PreCreationConfig.width : i12;
        int i17 = (i14 & 4) != 0 ? galleryV5PreCreationConfig.defaultContainersWidth : i13;
        Queue queue2 = (i14 & 8) != 0 ? galleryV5PreCreationConfig.containerWidthQueue : queue;
        Integer num4 = (i14 & 16) != 0 ? galleryV5PreCreationConfig.infoContainerWidth : num;
        Integer num5 = (i14 & 32) != 0 ? galleryV5PreCreationConfig.ugcContainerWidth : num2;
        Integer num6 = (i14 & 64) != 0 ? galleryV5PreCreationConfig.videoContainerWidth : num3;
        boolean z23 = (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? galleryV5PreCreationConfig.isBigStateInfo : z11;
        boolean z24 = (i14 & 256) != 0 ? galleryV5PreCreationConfig.isVerticalStateUgc : z12;
        boolean z25 = (i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? galleryV5PreCreationConfig.isCreateOnBoarding : z13;
        String str2 = (i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? galleryV5PreCreationConfig.buttonsBg : str;
        List list2 = (i14 & 2048) != 0 ? galleryV5PreCreationConfig.icons : list;
        boolean z26 = (i14 & 4096) != 0 ? galleryV5PreCreationConfig.hasWave : z14;
        boolean z27 = (i14 & 8192) != 0 ? galleryV5PreCreationConfig.hasVideoContent : z15;
        int i18 = i15;
        boolean z28 = (i14 & 16384) != 0 ? galleryV5PreCreationConfig.hasDifferentContainers : z16;
        boolean z29 = (i14 & 32768) != 0 ? galleryV5PreCreationConfig.isZoomable : z17;
        boolean z31 = (i14 & 65536) != 0 ? galleryV5PreCreationConfig.isSelect : z18;
        if ((i14 & 131072) != 0) {
            z22 = z31;
            z21 = galleryV5PreCreationConfig.isSingleButton;
        } else {
            z21 = z19;
            z22 = z31;
        }
        return galleryV5PreCreationConfig.copy(i18, i16, i17, queue2, num4, num5, num6, z23, z24, z25, str2, list2, z26, z27, z28, z29, z22, z21);
    }

    @NotNull
    public final GalleryV5PreCreationConfig copy(int height, int width, int defaultContainersWidth, Queue<Integer> containerWidthQueue, Integer infoContainerWidth, Integer ugcContainerWidth, Integer videoContainerWidth, boolean isBigStateInfo, boolean isVerticalStateUgc, boolean isCreateOnBoarding, String buttonsBg, List<String> icons, boolean hasWave, boolean hasVideoContent, boolean hasDifferentContainers, boolean isZoomable, boolean isSelect, boolean isSingleButton) {
        return new GalleryV5PreCreationConfig(height, width, defaultContainersWidth, containerWidthQueue, infoContainerWidth, ugcContainerWidth, videoContainerWidth, isBigStateInfo, isVerticalStateUgc, isCreateOnBoarding, buttonsBg, icons, hasWave, hasVideoContent, hasDifferentContainers, isZoomable, isSelect, isSingleButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GalleryV5PreCreationConfig)) {
            return false;
        }
        GalleryV5PreCreationConfig galleryV5PreCreationConfig = (GalleryV5PreCreationConfig) other;
        return this.height == galleryV5PreCreationConfig.height && this.width == galleryV5PreCreationConfig.width && this.defaultContainersWidth == galleryV5PreCreationConfig.defaultContainersWidth && Intrinsics.d(this.containerWidthQueue, galleryV5PreCreationConfig.containerWidthQueue) && Intrinsics.d(this.infoContainerWidth, galleryV5PreCreationConfig.infoContainerWidth) && Intrinsics.d(this.ugcContainerWidth, galleryV5PreCreationConfig.ugcContainerWidth) && Intrinsics.d(this.videoContainerWidth, galleryV5PreCreationConfig.videoContainerWidth) && this.isBigStateInfo == galleryV5PreCreationConfig.isBigStateInfo && this.isVerticalStateUgc == galleryV5PreCreationConfig.isVerticalStateUgc && this.isCreateOnBoarding == galleryV5PreCreationConfig.isCreateOnBoarding && Intrinsics.d(this.buttonsBg, galleryV5PreCreationConfig.buttonsBg) && Intrinsics.d(this.icons, galleryV5PreCreationConfig.icons) && this.hasWave == galleryV5PreCreationConfig.hasWave && this.hasVideoContent == galleryV5PreCreationConfig.hasVideoContent && this.hasDifferentContainers == galleryV5PreCreationConfig.hasDifferentContainers && this.isZoomable == galleryV5PreCreationConfig.isZoomable && this.isSelect == galleryV5PreCreationConfig.isSelect && this.isSingleButton == galleryV5PreCreationConfig.isSingleButton;
    }

    public final String getButtonsBg() {
        return this.buttonsBg;
    }

    public final Queue<Integer> getContainerWidthQueue() {
        return this.containerWidthQueue;
    }

    public final int getDefaultContainersWidth() {
        return this.defaultContainersWidth;
    }

    public final boolean getHasDifferentContainers() {
        return this.hasDifferentContainers;
    }

    public final boolean getHasVideoContent() {
        return this.hasVideoContent;
    }

    public final boolean getHasWave() {
        return this.hasWave;
    }

    public final int getHeight() {
        return this.height;
    }

    public final List<String> getIcons() {
        return this.icons;
    }

    public final Integer getInfoContainerWidth() {
        return this.infoContainerWidth;
    }

    public final Integer getUgcContainerWidth() {
        return this.ugcContainerWidth;
    }

    public final Integer getVideoContainerWidth() {
        return this.videoContainerWidth;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int a11 = C2454a.a(this.defaultContainersWidth, C2454a.a(this.width, Integer.hashCode(this.height) * 31, 31), 31);
        Queue<Integer> queue = this.containerWidthQueue;
        int hashCode = (a11 + (queue == null ? 0 : queue.hashCode())) * 31;
        Integer num = this.infoContainerWidth;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.ugcContainerWidth;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.videoContainerWidth;
        int a12 = C3532b.a(C3532b.a(C3532b.a((hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31, 31, this.isBigStateInfo), 31, this.isVerticalStateUgc), 31, this.isCreateOnBoarding);
        String str = this.buttonsBg;
        int hashCode4 = (a12 + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.icons;
        return Boolean.hashCode(this.isSingleButton) + C3532b.a(C3532b.a(C3532b.a(C3532b.a(C3532b.a((hashCode4 + (list != null ? list.hashCode() : 0)) * 31, 31, this.hasWave), 31, this.hasVideoContent), 31, this.hasDifferentContainers), 31, this.isZoomable), 31, this.isSelect);
    }

    /* renamed from: isBigStateInfo, reason: from getter */
    public final boolean getIsBigStateInfo() {
        return this.isBigStateInfo;
    }

    /* renamed from: isCreateOnBoarding, reason: from getter */
    public final boolean getIsCreateOnBoarding() {
        return this.isCreateOnBoarding;
    }

    /* renamed from: isSelect, reason: from getter */
    public final boolean getIsSelect() {
        return this.isSelect;
    }

    /* renamed from: isSingleButton, reason: from getter */
    public final boolean getIsSingleButton() {
        return this.isSingleButton;
    }

    /* renamed from: isZoomable, reason: from getter */
    public final boolean getIsZoomable() {
        return this.isZoomable;
    }

    @NotNull
    public String toString() {
        int i11 = this.height;
        int i12 = this.width;
        int i13 = this.defaultContainersWidth;
        Queue<Integer> queue = this.containerWidthQueue;
        Integer num = this.infoContainerWidth;
        Integer num2 = this.ugcContainerWidth;
        Integer num3 = this.videoContainerWidth;
        boolean z11 = this.isBigStateInfo;
        boolean z12 = this.isVerticalStateUgc;
        boolean z13 = this.isCreateOnBoarding;
        String str = this.buttonsBg;
        List<String> list = this.icons;
        boolean z14 = this.hasWave;
        boolean z15 = this.hasVideoContent;
        boolean z16 = this.hasDifferentContainers;
        boolean z17 = this.isZoomable;
        boolean z18 = this.isSelect;
        boolean z19 = this.isSingleButton;
        StringBuilder a11 = C2438a.a("GalleryV5PreCreationConfig(height=", i11, ", width=", ", defaultContainersWidth=", i12);
        a11.append(i13);
        a11.append(", containerWidthQueue=");
        a11.append(queue);
        a11.append(", infoContainerWidth=");
        c.e(a11, num, ", ugcContainerWidth=", num2, ", videoContainerWidth=");
        a11.append(num3);
        a11.append(", isBigStateInfo=");
        a11.append(z11);
        a11.append(", isVerticalStateUgc=");
        f.c(", isCreateOnBoarding=", ", buttonsBg=", a11, z12, z13);
        w.d(str, ", icons=", ", hasWave=", a11, list);
        f.c(", hasVideoContent=", ", hasDifferentContainers=", a11, z14, z15);
        f.c(", isZoomable=", ", isSelect=", a11, z16, z17);
        a11.append(z18);
        a11.append(", isSingleButton=");
        a11.append(z19);
        a11.append(")");
        return a11.toString();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ GalleryV5PreCreationConfig(int r23, int r24, int r25, java.util.Queue r26, java.lang.Integer r27, java.lang.Integer r28, java.lang.Integer r29, boolean r30, boolean r31, boolean r32, java.lang.String r33, java.util.List r34, boolean r35, boolean r36, boolean r37, boolean r38, boolean r39, boolean r40, int r41, kotlin.jvm.internal.DefaultConstructorMarker r42) {
        /*
            r22 = this;
            r0 = r41
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L9
            r7 = r2
            goto Lb
        L9:
            r7 = r26
        Lb:
            r1 = r0 & 16
            if (r1 == 0) goto L11
            r8 = r2
            goto L13
        L11:
            r8 = r27
        L13:
            r1 = r0 & 32
            if (r1 == 0) goto L19
            r9 = r2
            goto L1b
        L19:
            r9 = r28
        L1b:
            r1 = r0 & 64
            if (r1 == 0) goto L21
            r10 = r2
            goto L23
        L21:
            r10 = r29
        L23:
            r1 = r0 & 128(0x80, float:1.8E-43)
            r3 = 1
            if (r1 == 0) goto L2a
            r11 = r3
            goto L2c
        L2a:
            r11 = r30
        L2c:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L32
            r12 = r3
            goto L34
        L32:
            r12 = r31
        L34:
            r1 = r0 & 512(0x200, float:7.17E-43)
            r3 = 0
            if (r1 == 0) goto L3b
            r13 = r3
            goto L3d
        L3b:
            r13 = r32
        L3d:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L43
            r14 = r2
            goto L45
        L43:
            r14 = r33
        L45:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L4b
            r15 = r2
            goto L4d
        L4b:
            r15 = r34
        L4d:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L54
            r16 = r3
            goto L56
        L54:
            r16 = r35
        L56:
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto L5d
            r17 = r3
            goto L5f
        L5d:
            r17 = r36
        L5f:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L66
            r18 = r3
            goto L68
        L66:
            r18 = r37
        L68:
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L7d
            r19 = r3
            r4 = r23
            r5 = r24
            r6 = r25
            r20 = r39
            r21 = r40
            r3 = r22
            goto L8b
        L7d:
            r19 = r38
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r20 = r39
            r21 = r40
        L8b:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5PreCreationConfig.<init>(int, int, int, java.util.Queue, java.lang.Integer, java.lang.Integer, java.lang.Integer, boolean, boolean, boolean, java.lang.String, java.util.List, boolean, boolean, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
