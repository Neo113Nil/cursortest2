package com.vk.onboarding.impl.stat;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.onboarding.api.stat.VkOnboardingStat$Delegate;
import com.vk.onboarding.api.stat.VkOnboardingStat$Type;
import com.vk.stat.scheme.CommonOnboardingStat$TypeOnboardingEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeView;
import kotlin.NoWhenBranchMatchedException;
import xsna.bjc;
import xsna.bvt0;
import xsna.e8v0;
import xsna.uzp0;

/* compiled from: VkOnboardingStatDelegateImpl.kt */
/* loaded from: classes4.dex */
public final class VkOnboardingStatDelegateImpl implements VkOnboardingStat$Delegate {
    public static final Parcelable.Creator<VkOnboardingStatDelegateImpl> CREATOR = new a();
    public final VkOnboardingStat$Type b;
    public final String c;
    public final int d;
    public final int e;
    public long f;

    /* compiled from: VkOnboardingStatDelegateImpl.kt */
    public static final class a implements Parcelable.Creator<VkOnboardingStatDelegateImpl> {
        @Override // android.os.Parcelable.Creator
        public final VkOnboardingStatDelegateImpl createFromParcel(Parcel parcel) {
            VkOnboardingStat$Type vkOnboardingStat$Type = (VkOnboardingStat$Type) parcel.readParcelable(VkOnboardingStat$Type.class.getClassLoader());
            if (vkOnboardingStat$Type == null) {
                vkOnboardingStat$Type = VkOnboardingStat$Type.Banner;
            }
            String readString = parcel.readString();
            if (readString == null) {
                readString = "";
            }
            VkOnboardingStatDelegateImpl vkOnboardingStatDelegateImpl = new VkOnboardingStatDelegateImpl(vkOnboardingStat$Type, readString, parcel.readInt(), parcel.readInt());
            vkOnboardingStatDelegateImpl.f = parcel.readLong();
            return vkOnboardingStatDelegateImpl;
        }

        @Override // android.os.Parcelable.Creator
        public final VkOnboardingStatDelegateImpl[] newArray(int i) {
            return new VkOnboardingStatDelegateImpl[i];
        }
    }

    /* compiled from: VkOnboardingStatDelegateImpl.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkOnboardingStat$Type.values().length];
            try {
                iArr[VkOnboardingStat$Type.Banner.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkOnboardingStat$Type.Tooltip.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkOnboardingStat$Type.Fullscreen.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VkOnboardingStat$Type.Toast.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VkOnboardingStat$Type.Highlighter.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VkOnboardingStat$Type.Animation.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VkOnboardingStatDelegateImpl(VkOnboardingStat$Type vkOnboardingStat$Type, String str, int i, int i2) {
        this.b = vkOnboardingStat$Type;
        this.c = str;
        this.d = i;
        this.e = i2;
    }

    public static /* synthetic */ void d(VkOnboardingStatDelegateImpl vkOnboardingStatDelegateImpl, CommonOnboardingStat$TypeOnboardingEvent.EventType eventType, int i) {
        vkOnboardingStatDelegateImpl.b(eventType, (i & 2) == 0, 0);
    }

    public final CommonOnboardingStat$TypeOnboardingEvent a(CommonOnboardingStat$TypeOnboardingEvent.EventType eventType, int i) {
        CommonOnboardingStat$TypeOnboardingEvent.OnboardingType onboardingType;
        switch (b.$EnumSwitchMapping$0[this.b.ordinal()]) {
            case 1:
                onboardingType = CommonOnboardingStat$TypeOnboardingEvent.OnboardingType.BANNER;
                break;
            case 2:
                onboardingType = CommonOnboardingStat$TypeOnboardingEvent.OnboardingType.TOOLTIP;
                break;
            case 3:
                onboardingType = CommonOnboardingStat$TypeOnboardingEvent.OnboardingType.FULLSCREEN;
                break;
            case 4:
                onboardingType = CommonOnboardingStat$TypeOnboardingEvent.OnboardingType.TOAST;
                break;
            case 5:
                onboardingType = CommonOnboardingStat$TypeOnboardingEvent.OnboardingType.HIGHLIGHTER;
                break;
            case 6:
                onboardingType = CommonOnboardingStat$TypeOnboardingEvent.OnboardingType.ANIMATION;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new CommonOnboardingStat$TypeOnboardingEvent(onboardingType, eventType, this.c, this.e, null, Integer.valueOf(this.d), Long.valueOf(this.f > 0 ? System.currentTimeMillis() - this.f : 0L), Integer.valueOf(i), 16, null);
    }

    public final void b(CommonOnboardingStat$TypeOnboardingEvent.EventType eventType, boolean z, int i) {
        if (!z) {
            UiTracker uiTracker = UiTracker.a;
            new bvt0(UiTracker.c(), SchemeStat$TypeView.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.ONBOARDING, null, null, null, null, null, 62, null), String.valueOf(this.f), String.valueOf(this.f > 0 ? System.currentTimeMillis() - this.f : 0L), null, a(eventType, i), 8)).q();
            return;
        }
        SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.ONBOARDING, null, null, null, null, null, 62, null), a(eventType, i), 2);
        UiTracker uiTracker2 = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b2, uzp0Var.a).q();
    }

    @Override // com.vk.onboarding.api.stat.VkOnboardingStat$Delegate
    public final void d4(e8v0 e8v0Var) {
        if (e8v0Var.equals(e8v0.a.b)) {
            d(this, CommonOnboardingStat$TypeOnboardingEvent.EventType.CLICK, 6);
            return;
        }
        if (e8v0Var.equals(e8v0.b.b)) {
            d(this, CommonOnboardingStat$TypeOnboardingEvent.EventType.CLICK_BANNER, 6);
            return;
        }
        if (e8v0Var.equals(e8v0.c.b)) {
            d(this, CommonOnboardingStat$TypeOnboardingEvent.EventType.CLICK_CTA, 6);
            return;
        }
        if (e8v0Var instanceof e8v0.d) {
            d(this, CommonOnboardingStat$TypeOnboardingEvent.EventType.CLICK_CTA_N_SCREEN, 2);
            return;
        }
        if (e8v0Var.equals(e8v0.e.b)) {
            d(this, CommonOnboardingStat$TypeOnboardingEvent.EventType.CLICK_TOOLTIP, 6);
            return;
        }
        if (e8v0Var.equals(e8v0.f.b)) {
            d(this, CommonOnboardingStat$TypeOnboardingEvent.EventType.CLICK_TOOLTIP_ANCHOR, 6);
            return;
        }
        if (e8v0Var.equals(e8v0.g.b)) {
            d(this, CommonOnboardingStat$TypeOnboardingEvent.EventType.CLOSE, 6);
            return;
        }
        if (e8v0Var.equals(e8v0.h.b)) {
            d(this, CommonOnboardingStat$TypeOnboardingEvent.EventType.CLOSE_AUTO, 6);
            return;
        }
        if (e8v0Var.equals(e8v0.k.b)) {
            d(this, CommonOnboardingStat$TypeOnboardingEvent.EventType.CLOSE_EXIT, 6);
            return;
        }
        if (e8v0Var instanceof e8v0.l) {
            d(this, CommonOnboardingStat$TypeOnboardingEvent.EventType.CLOSE_N_SCREEN, 2);
            return;
        }
        if (e8v0Var.equals(e8v0.i.b)) {
            d(this, CommonOnboardingStat$TypeOnboardingEvent.EventType.CLOSE_CLICK_OUTSIDE, 6);
            return;
        }
        if (e8v0Var.equals(e8v0.j.b)) {
            d(this, CommonOnboardingStat$TypeOnboardingEvent.EventType.CLOSE_CLICK_OUTSIDE_NONCLICKABLE, 6);
            return;
        }
        if (e8v0Var.equals(e8v0.m.b)) {
            if (this.f == 0) {
                this.f = System.currentTimeMillis();
            }
            d(this, CommonOnboardingStat$TypeOnboardingEvent.EventType.VIEW, 4);
        } else if (e8v0Var.equals(e8v0.n.b)) {
            d(this, CommonOnboardingStat$TypeOnboardingEvent.EventType.VIEW_ALL_SCREEN, 4);
        } else {
            if (!(e8v0Var instanceof e8v0.o)) {
                throw new NoWhenBranchMatchedException();
            }
            b(CommonOnboardingStat$TypeOnboardingEvent.EventType.VIEW_N_SCREEN, true, 0);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, 0);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeLong(this.f);
    }
}
