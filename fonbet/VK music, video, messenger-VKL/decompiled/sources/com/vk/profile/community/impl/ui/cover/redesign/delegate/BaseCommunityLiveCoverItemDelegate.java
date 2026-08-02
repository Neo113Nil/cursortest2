package com.vk.profile.community.impl.ui.cover.redesign.delegate;

import android.provider.Settings;
import com.unity3d.services.UnityAdsConstants;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.b8h;
import xsna.gwh;
import xsna.q8h;
import xsna.s3q0;
import xsna.wzs;
import xsna.zrp;

/* compiled from: BaseCommunityLiveCoverItemDelegate.kt */
/* loaded from: classes5.dex */
public abstract class BaseCommunityLiveCoverItemDelegate<T extends gwh<?, ?>> implements q8h<T> {
    public final b8h a;
    public final wzs<Integer, Float, s3q0> b;
    public ViewState c = ViewState.COMMON;
    public final boolean d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BaseCommunityLiveCoverItemDelegate.kt */
    public static final class ViewState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ViewState[] $VALUES;
        public static final ViewState COMMON;
        public static final ViewState ERROR;
        public static final ViewState PROGRESS;

        static {
            ViewState viewState = new ViewState("COMMON", 0);
            COMMON = viewState;
            ViewState viewState2 = new ViewState("PROGRESS", 1);
            PROGRESS = viewState2;
            ViewState viewState3 = new ViewState("ERROR", 2);
            ERROR = viewState3;
            ViewState[] viewStateArr = {viewState, viewState2, viewState3};
            $VALUES = viewStateArr;
            $ENTRIES = new asp(viewStateArr);
        }

        public ViewState() {
            throw null;
        }

        public static ViewState valueOf(String str) {
            return (ViewState) Enum.valueOf(ViewState.class, str);
        }

        public static ViewState[] values() {
            return (ViewState[]) $VALUES.clone();
        }
    }

    /* compiled from: BaseCommunityLiveCoverItemDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ViewState.values().length];
            try {
                iArr[ViewState.COMMON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ViewState.PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ViewState.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseCommunityLiveCoverItemDelegate(b8h b8hVar, wzs<? super Integer, ? super Float, s3q0> wzsVar) {
        this.a = b8hVar;
        this.b = wzsVar;
        this.d = !(Settings.Global.getFloat(b8hVar.getContext().getContentResolver(), "animator_duration_scale", 1.0f) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final void b(ViewState viewState) {
        if (this.c == viewState) {
            return;
        }
        this.c = viewState;
        int i = a.$EnumSwitchMapping$0[viewState.ordinal()];
        b8h b8hVar = this.a;
        if (i == 1) {
            b8hVar.i.removeCallbacks(b8hVar.j);
            b8hVar.g.setVisibility(8);
            b8hVar.f.setVisibility(8);
        } else if (i == 2) {
            b8hVar.i.postDelayed(b8hVar.j, 1500L);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            b8hVar.i.removeCallbacks(b8hVar.j);
            b8hVar.g.setVisibility(0);
            b8hVar.f.setVisibility(8);
        }
    }

    public final void c(float f) {
        Integer valueOf = Integer.valueOf(getModel().i);
        Float valueOf2 = Float.valueOf(f);
        if (!this.d) {
            valueOf2 = null;
        }
        this.b.invoke(valueOf, Float.valueOf(valueOf2 != null ? valueOf2.floatValue() : 1.0f));
    }
}
