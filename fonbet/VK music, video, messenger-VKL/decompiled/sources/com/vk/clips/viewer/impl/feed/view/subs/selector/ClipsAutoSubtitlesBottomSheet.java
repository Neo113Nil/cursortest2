package com.vk.clips.viewer.impl.feed.view.subs.selector;

import android.app.Activity;
import android.view.LayoutInflater;
import com.vkontakte.android.R;
import defpackage.h;
import defpackage.i;
import defpackage.q0;
import java.util.ArrayList;
import xsna.an6;
import xsna.asp;
import xsna.av20;
import xsna.cjd;
import xsna.dhr0;
import xsna.dw20;
import xsna.e43;
import xsna.ez20;
import xsna.kq6;
import xsna.l7s;
import xsna.mz;
import xsna.zrp;

/* compiled from: ClipsAutoSubtitlesBottomSheet.kt */
/* loaded from: classes17.dex */
public final class ClipsAutoSubtitlesBottomSheet extends kq6 {
    public final Activity c;
    public final ClipsAutoSubsSetting d;
    public final an6 e;
    public final ez20 f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipsAutoSubtitlesBottomSheet.kt */
    public static final class ClipsAutoSubsSetting {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ClipsAutoSubsSetting[] $VALUES;
        public static final ClipsAutoSubsSetting DISABLED;
        public static final ClipsAutoSubsSetting ENABLED;
        public static final ClipsAutoSubsSetting MUTE_ONLY;

        static {
            ClipsAutoSubsSetting clipsAutoSubsSetting = new ClipsAutoSubsSetting("ENABLED", 0);
            ENABLED = clipsAutoSubsSetting;
            ClipsAutoSubsSetting clipsAutoSubsSetting2 = new ClipsAutoSubsSetting("DISABLED", 1);
            DISABLED = clipsAutoSubsSetting2;
            ClipsAutoSubsSetting clipsAutoSubsSetting3 = new ClipsAutoSubsSetting("MUTE_ONLY", 2);
            MUTE_ONLY = clipsAutoSubsSetting3;
            ClipsAutoSubsSetting[] clipsAutoSubsSettingArr = {clipsAutoSubsSetting, clipsAutoSubsSetting2, clipsAutoSubsSetting3};
            $VALUES = clipsAutoSubsSettingArr;
            $ENTRIES = new asp(clipsAutoSubsSettingArr);
        }

        public ClipsAutoSubsSetting() {
            throw null;
        }

        public static ClipsAutoSubsSetting valueOf(String str) {
            return (ClipsAutoSubsSetting) Enum.valueOf(ClipsAutoSubsSetting.class, str);
        }

        public static ClipsAutoSubsSetting[] values() {
            return (ClipsAutoSubsSetting[]) $VALUES.clone();
        }
    }

    /* compiled from: ClipsAutoSubtitlesBottomSheet.kt */
    public static final class a {
        public final ClipsAutoSubsSetting a;
        public final boolean b;

        /* compiled from: ClipsAutoSubtitlesBottomSheet.kt */
        /* renamed from: com.vk.clips.viewer.impl.feed.view.subs.selector.ClipsAutoSubtitlesBottomSheet$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0711a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ClipsAutoSubsSetting.values().length];
                try {
                    iArr[ClipsAutoSubsSetting.ENABLED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ClipsAutoSubsSetting.DISABLED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ClipsAutoSubsSetting.MUTE_ONLY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public a(ClipsAutoSubsSetting clipsAutoSubsSetting, boolean z) {
            this.a = clipsAutoSubsSetting;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SettingsItem(setting=");
            sb.append(this.a);
            sb.append(", isSelected=");
            return q0.a(sb, this.b, ')');
        }
    }

    public ClipsAutoSubtitlesBottomSheet(Activity activity, ClipsAutoSubsSetting clipsAutoSubsSetting, an6 an6Var, ez20 ez20Var) {
        this.c = activity;
        this.d = clipsAutoSubsSetting;
        this.e = an6Var;
        this.f = ez20Var;
    }

    @Override // xsna.kq6
    public final dw20 a() {
        ClipsAutoSubsSetting clipsAutoSubsSetting = ClipsAutoSubsSetting.DISABLED;
        ClipsAutoSubsSetting clipsAutoSubsSetting2 = this.d;
        a aVar = new a(clipsAutoSubsSetting, clipsAutoSubsSetting2 == clipsAutoSubsSetting);
        ClipsAutoSubsSetting clipsAutoSubsSetting3 = ClipsAutoSubsSetting.ENABLED;
        a aVar2 = new a(clipsAutoSubsSetting3, clipsAutoSubsSetting2 == clipsAutoSubsSetting3);
        ClipsAutoSubsSetting clipsAutoSubsSetting4 = ClipsAutoSubsSetting.MUTE_ONLY;
        ArrayList a2 = e43.a(aVar, aVar2, new a(clipsAutoSubsSetting4, clipsAutoSubsSetting2 == clipsAutoSubsSetting4));
        av20.a aVar3 = new av20.a();
        Activity activity = this.c;
        dhr0.a.getClass();
        int i = dhr0.u().c;
        aVar3.d(R.layout.actions_popup_item, LayoutInflater.from(new l7s(activity, dhr0.u().c)));
        aVar3.d = new com.vk.clips.viewer.impl.feed.view.subs.selector.a(activity);
        aVar3.c(new cjd(this, 0));
        av20 b = aVar3.b();
        b.setItems(a2);
        return ((dw20.b) dw20.a.k(new dw20.b(activity, null).a0(new h(this, 19)).d0(new i(this, 22)).f0(new mz(this, 27)), b, 4)).I0("clips_autosubs_settings");
    }
}
