package com.vk.core.ui.tracking;

import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeNavgo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.epx;
import xsna.ip20;
import xsna.iy50;
import xsna.m0q0;
import xsna.n0q0;
import xsna.x8h0;
import xsna.zrp;

/* compiled from: UiTrackingScreen.kt */
/* loaded from: classes.dex */
public final class UiTrackingScreen {
    public static final Companion j = new Companion();
    public MobileOfficialAppsCoreNavStat$EventScreen a;
    public final String b;
    public final WeakReference<m0q0> c;
    public final Companion.DialogType d;
    public final HashSet<x8h0> e;
    public SchemeStat$EventItem f;
    public ip20 g;
    public boolean h;
    public SchemeStat$TypeNavgo.Cause i;

    /* compiled from: UiTrackingScreen.kt */
    public static final class Companion {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: UiTrackingScreen.kt */
        public static final class DialogType {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ DialogType[] $VALUES;
            public static final DialogType DIALOG_ALERT;
            public static final DialogType DIALOG_MODAL_DESTINATION;
            public static final DialogType DIALOG_MODAL_SOURCE;

            static {
                DialogType dialogType = new DialogType("DIALOG_ALERT", 0);
                DIALOG_ALERT = dialogType;
                DialogType dialogType2 = new DialogType("DIALOG_MODAL_SOURCE", 1);
                DIALOG_MODAL_SOURCE = dialogType2;
                DialogType dialogType3 = new DialogType("DIALOG_MODAL_DESTINATION", 2);
                DIALOG_MODAL_DESTINATION = dialogType3;
                DialogType[] dialogTypeArr = {dialogType, dialogType2, dialogType3};
                $VALUES = dialogTypeArr;
                $ENTRIES = new asp(dialogTypeArr);
            }

            public DialogType() {
                throw null;
            }

            public static DialogType valueOf(String str) {
                return (DialogType) Enum.valueOf(DialogType.class, str);
            }

            public static DialogType[] values() {
                return (DialogType[]) $VALUES.clone();
            }
        }

        /* compiled from: UiTrackingScreen.kt */
        /* loaded from: classes17.dex */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DialogType.values().length];
                try {
                    iArr[DialogType.DIALOG_ALERT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DialogType.DIALOG_MODAL_DESTINATION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[DialogType.DIALOG_MODAL_SOURCE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static UiTrackingScreen a(UiTrackingScreen uiTrackingScreen, Object obj) {
            m0q0 m0q0Var;
            m0q0 m0q0Var2 = (!(obj instanceof m0q0) || (obj instanceof n0q0)) ? null : (m0q0) obj;
            UiTrackingScreen b = m0q0Var2 != null ? UiTrackingScreen.b(uiTrackingScreen, new WeakReference(m0q0Var2), null, 11) : UiTrackingScreen.b(uiTrackingScreen, null, null, 15);
            WeakReference<m0q0> weakReference = b.c;
            if (weakReference != null && (m0q0Var = weakReference.get()) != null) {
                m0q0Var.y(b);
            }
            return b;
        }

        public static UiTrackingScreen b(Object obj) {
            return a(new UiTrackingScreen(MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE), obj);
        }
    }

    public /* synthetic */ UiTrackingScreen(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, String str, Companion.DialogType dialogType, int i) {
        this(mobileOfficialAppsCoreNavStat$EventScreen, str, (WeakReference<m0q0>) null, (i & 8) != 0 ? null : dialogType);
    }

    public static UiTrackingScreen b(UiTrackingScreen uiTrackingScreen, WeakReference weakReference, Companion.DialogType dialogType, int i) {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = uiTrackingScreen.a;
        String str = uiTrackingScreen.b;
        if ((i & 4) != 0) {
            weakReference = uiTrackingScreen.c;
        }
        if ((i & 8) != 0) {
            dialogType = uiTrackingScreen.d;
        }
        uiTrackingScreen.getClass();
        UiTrackingScreen uiTrackingScreen2 = new UiTrackingScreen(mobileOfficialAppsCoreNavStat$EventScreen, str, (WeakReference<m0q0>) weakReference, dialogType);
        uiTrackingScreen2.f = uiTrackingScreen.f;
        uiTrackingScreen2.e.addAll(uiTrackingScreen.e);
        uiTrackingScreen2.h = uiTrackingScreen.h;
        uiTrackingScreen2.i = uiTrackingScreen.i;
        uiTrackingScreen2.g = uiTrackingScreen.g;
        return uiTrackingScreen2;
    }

    public final void a(x8h0 x8h0Var) {
        this.e.add(x8h0Var);
    }

    public final boolean c(UiTrackingScreen uiTrackingScreen) {
        return equals(uiTrackingScreen) && epx.f(this.f, uiTrackingScreen.f) && epx.f(this.e, uiTrackingScreen.e) && this.d == uiTrackingScreen.d;
    }

    public final boolean d() {
        Companion.DialogType dialogType = Companion.DialogType.DIALOG_MODAL_DESTINATION;
        Companion.DialogType dialogType2 = this.d;
        return dialogType2 == dialogType || dialogType2 == Companion.DialogType.DIALOG_MODAL_SOURCE;
    }

    public final boolean e() {
        return this.a == MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!UiTrackingScreen.class.equals(obj != null ? obj.getClass() : null) || !(obj instanceof UiTrackingScreen)) {
            return false;
        }
        UiTrackingScreen uiTrackingScreen = (UiTrackingScreen) obj;
        return this.a == uiTrackingScreen.a && epx.f(this.b, uiTrackingScreen.b);
    }

    public final iy50.a f() {
        UiTracker uiTracker = UiTracker.a;
        return new iy50.a(this.a, this.f, new ArrayList(this.e));
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String str = this.b;
        if (str != null) {
            return "Screen [screen=" + this.a + ", default=" + str + ']';
        }
        if (this.f == null) {
            return "Screen [screen=" + this.a + ']';
        }
        return "Screen [screen=" + this.a + ", item=" + this.f + ']';
    }

    public UiTrackingScreen(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, String str, WeakReference<m0q0> weakReference, Companion.DialogType dialogType) {
        this.a = mobileOfficialAppsCoreNavStat$EventScreen;
        this.b = str;
        this.c = weakReference;
        this.d = dialogType;
        this.e = new HashSet<>();
        this.h = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UiTrackingScreen(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
        this(mobileOfficialAppsCoreNavStat$EventScreen, (String) null, (Companion.DialogType) (0 == true ? 1 : 0), 12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UiTrackingScreen(Companion.DialogType dialogType) {
        this(r0, (String) null, dialogType, 4);
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        int i = Companion.a.$EnumSwitchMapping$0[dialogType.ordinal()];
        if (i == 1) {
            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.DIALOG;
        } else if (i == 2) {
            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.DIALOG_MODAL;
        } else if (i == 3) {
            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.DIALOG_MODAL;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
