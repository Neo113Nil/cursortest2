package com.vk.superapp.base.js.bridge;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.api.dto.group.WebGroupShortInfo;
import com.vk.superapp.api.dto.identity.WebIdentityCardData;
import com.vk.superapp.base.js.bridge.data.OnboardingModalArguments;
import com.vk.superapp.base.js.bridge.data.PersonalDiscountDialogType;
import defpackage.n0;
import java.util.ArrayList;
import java.util.List;
import xsna.asp;
import xsna.cvs;
import xsna.gzs;
import xsna.izs;
import xsna.l1w0;
import xsna.lvv0;
import xsna.mll0;
import xsna.pod0;
import xsna.q7j0;
import xsna.s3q0;
import xsna.tb0;
import xsna.w7y;
import xsna.wzs;
import xsna.zhx0;
import xsna.zrp;

/* compiled from: VkUiView.kt */
/* loaded from: classes6.dex */
public interface VkUiView {

    /* compiled from: VkUiView.kt */
    public interface BannerAd {

        /* compiled from: VkUiView.kt */
        public static final class UiData {
            public final LayoutType a;
            public final LayoutType b;
            public final BannerLocation c;
            public final BannerAlign d;
            public final HeightType e;
            public final Orientation f;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: VkUiView.kt */
            public static final class BannerAlign {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ BannerAlign[] $VALUES;
                public static final BannerAlign CENTER;
                public static final a Companion;
                public static final BannerAlign LEFT;
                public static final BannerAlign RIGHT;
                public static final BannerAlign UNSPECIFIED;

                /* compiled from: VkUiView.kt */
                public static final class a {
                }

                static {
                    BannerAlign bannerAlign = new BannerAlign("LEFT", 0);
                    LEFT = bannerAlign;
                    BannerAlign bannerAlign2 = new BannerAlign("CENTER", 1);
                    CENTER = bannerAlign2;
                    BannerAlign bannerAlign3 = new BannerAlign("RIGHT", 2);
                    RIGHT = bannerAlign3;
                    BannerAlign bannerAlign4 = new BannerAlign("UNSPECIFIED", 3);
                    UNSPECIFIED = bannerAlign4;
                    BannerAlign[] bannerAlignArr = {bannerAlign, bannerAlign2, bannerAlign3, bannerAlign4};
                    $VALUES = bannerAlignArr;
                    $ENTRIES = new asp(bannerAlignArr);
                    Companion = new a();
                }

                public BannerAlign() {
                    throw null;
                }

                public static BannerAlign valueOf(String str) {
                    return (BannerAlign) Enum.valueOf(BannerAlign.class, str);
                }

                public static BannerAlign[] values() {
                    return (BannerAlign[]) $VALUES.clone();
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: VkUiView.kt */
            public static final class BannerLocation {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ BannerLocation[] $VALUES;
                public static final BannerLocation BOTTOM;
                public static final BannerLocation TOP;

                static {
                    BannerLocation bannerLocation = new BannerLocation("TOP", 0);
                    TOP = bannerLocation;
                    BannerLocation bannerLocation2 = new BannerLocation("BOTTOM", 1);
                    BOTTOM = bannerLocation2;
                    BannerLocation[] bannerLocationArr = {bannerLocation, bannerLocation2};
                    $VALUES = bannerLocationArr;
                    $ENTRIES = new asp(bannerLocationArr);
                }

                public BannerLocation() {
                    throw null;
                }

                public static BannerLocation valueOf(String str) {
                    return (BannerLocation) Enum.valueOf(BannerLocation.class, str);
                }

                public static BannerLocation[] values() {
                    return (BannerLocation[]) $VALUES.clone();
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: VkUiView.kt */
            public static final class HeightType {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ HeightType[] $VALUES;
                public static final HeightType COMPACT;
                public static final HeightType REGULAR;

                static {
                    HeightType heightType = new HeightType("COMPACT", 0);
                    COMPACT = heightType;
                    HeightType heightType2 = new HeightType("REGULAR", 1);
                    REGULAR = heightType2;
                    HeightType[] heightTypeArr = {heightType, heightType2};
                    $VALUES = heightTypeArr;
                    $ENTRIES = new asp(heightTypeArr);
                }

                public HeightType() {
                    throw null;
                }

                public static HeightType valueOf(String str) {
                    return (HeightType) Enum.valueOf(HeightType.class, str);
                }

                public static HeightType[] values() {
                    return (HeightType[]) $VALUES.clone();
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: VkUiView.kt */
            public static final class LayoutType {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ LayoutType[] $VALUES;
                public static final LayoutType OVERLAY;
                public static final LayoutType RESIZE;

                static {
                    LayoutType layoutType = new LayoutType("RESIZE", 0);
                    RESIZE = layoutType;
                    LayoutType layoutType2 = new LayoutType("OVERLAY", 1);
                    OVERLAY = layoutType2;
                    LayoutType[] layoutTypeArr = {layoutType, layoutType2};
                    $VALUES = layoutTypeArr;
                    $ENTRIES = new asp(layoutTypeArr);
                }

                public LayoutType() {
                    throw null;
                }

                public static LayoutType valueOf(String str) {
                    return (LayoutType) Enum.valueOf(LayoutType.class, str);
                }

                public static LayoutType[] values() {
                    return (LayoutType[]) $VALUES.clone();
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: VkUiView.kt */
            public static final class Orientation {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ Orientation[] $VALUES;
                public static final Orientation HORIZONTAL;
                public static final Orientation UNSPECIFIED;
                public static final Orientation VERTICAL;

                static {
                    Orientation orientation = new Orientation("VERTICAL", 0);
                    VERTICAL = orientation;
                    Orientation orientation2 = new Orientation("HORIZONTAL", 1);
                    HORIZONTAL = orientation2;
                    Orientation orientation3 = new Orientation("UNSPECIFIED", 2);
                    UNSPECIFIED = orientation3;
                    Orientation[] orientationArr = {orientation, orientation2, orientation3};
                    $VALUES = orientationArr;
                    $ENTRIES = new asp(orientationArr);
                }

                public Orientation() {
                    throw null;
                }

                public static Orientation valueOf(String str) {
                    return (Orientation) Enum.valueOf(Orientation.class, str);
                }

                public static Orientation[] values() {
                    return (Orientation[]) $VALUES.clone();
                }
            }

            public UiData(LayoutType layoutType, LayoutType layoutType2, BannerLocation bannerLocation, BannerAlign bannerAlign, HeightType heightType, Orientation orientation) {
                this.a = layoutType;
                this.b = layoutType2;
                this.c = bannerLocation;
                this.d = bannerAlign;
                this.e = heightType;
                this.f = orientation;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UiData)) {
                    return false;
                }
                UiData uiData = (UiData) obj;
                return this.a == uiData.a && this.b == uiData.b && this.c == uiData.c && this.d == uiData.d && this.e == uiData.e && this.f == uiData.f;
            }

            public final int hashCode() {
                return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
            }

            public final String toString() {
                return "UiData(layoutType=" + this.a + ", landscapeLayoutType=" + this.b + ", bannerLocation=" + this.c + ", bannerAlign=" + this.d + ", heightType=" + this.e + ", orientation=" + this.f + ')';
            }
        }

        void K2();

        boolean Oe();

        void Q4(View view, UiData uiData, wzs<? super Integer, ? super Integer, s3q0> wzsVar);

        boolean Y6(UiData.BannerAlign bannerAlign);
    }

    /* compiled from: VkUiView.kt */
    public static final class a {
        public static /* synthetic */ void a(VkUiView vkUiView, long j, boolean z, mll0 mll0Var, pod0 pod0Var, boolean z2, int i) {
            if ((i & 4) != 0) {
                mll0Var = null;
            }
            if ((i & 8) != 0) {
                pod0Var = null;
            }
            if ((i & 16) != 0) {
                z2 = true;
            }
            vkUiView.yc(j, z, mll0Var, pod0Var, z2);
        }
    }

    /* compiled from: VkUiView.kt */
    public interface b {
    }

    void Af();

    Activity B0();

    void C4(PersonalDiscountDialogType personalDiscountDialogType);

    void D1(tb0 tb0Var);

    io.reactivex.rxjava3.disposables.b D6();

    void Ei();

    boolean Hb(zhx0 zhx0Var);

    void Hc(String str);

    void Ii();

    void J3(Intent intent, int... iArr);

    void Jb(String str);

    void Og(String str);

    void Qb();

    void Qm();

    boolean R7(boolean z);

    void Rl();

    String T0();

    void U3(ArrayList arrayList, WebIdentityCardData webIdentityCardData, WebApiApplication webApiApplication);

    void Va(OnboardingModalArguments onboardingModalArguments, n0 n0Var);

    void W7(boolean z, boolean z2);

    void Wl();

    boolean Ze(String str, boolean z);

    void ac();

    void am(List<String> list);

    boolean bh();

    boolean cl(boolean z);

    void e3(tb0 tb0Var);

    void e8(boolean z, cvs cvsVar);

    void f7(long j, long j2, String str);

    void h2();

    void i4(String str, String str2, String str3);

    boolean i6();

    void ic();

    BannerAd j0();

    void jk();

    izs<lvv0, s3q0> ke();

    void kk(String str, q7j0 q7j0Var);

    void lj(boolean z);

    void n9();

    void oc(String str);

    void oh(WebGroupShortInfo webGroupShortInfo, w7y w7yVar);

    void pl(Integer num);

    void y4(List<String> list, Long l, WebApiApplication webApiApplication, l1w0 l1w0Var);

    void yc(long j, boolean z, gzs gzsVar, izs izsVar, boolean z2);
}
