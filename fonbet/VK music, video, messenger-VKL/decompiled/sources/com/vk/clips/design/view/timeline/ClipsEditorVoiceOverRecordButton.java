package com.vk.clips.design.view.timeline;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.timeline.ClipsEditorVoiceOverRecordButton;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.ad0;
import xsna.asp;
import xsna.e1;
import xsna.f4m;
import xsna.gzs;
import xsna.h9;
import xsna.ixd;
import xsna.jjc;
import xsna.msy;
import xsna.or4;
import xsna.qc;
import xsna.s3q0;
import xsna.s5;
import xsna.t5;
import xsna.xo2;
import xsna.xqc;
import xsna.zrp;

/* compiled from: ClipsEditorVoiceOverRecordButton.kt */
/* loaded from: classes16.dex */
public final class ClipsEditorVoiceOverRecordButton extends ConstraintLayout {
    public static final /* synthetic */ int B = 0;
    public RecordState A;
    public final Object t;
    public final Object u;
    public final Object v;
    public final Object w;
    public final Object x;
    public gzs<s3q0> y;
    public boolean z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipsEditorVoiceOverRecordButton.kt */
    public static final class RecordState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ RecordState[] $VALUES;
        public static final RecordState IDLE;
        public static final RecordState RECORDING;

        static {
            RecordState recordState = new RecordState("IDLE", 0);
            IDLE = recordState;
            RecordState recordState2 = new RecordState("RECORDING", 1);
            RECORDING = recordState2;
            RecordState[] recordStateArr = {recordState, recordState2};
            $VALUES = recordStateArr;
            $ENTRIES = new asp(recordStateArr);
        }

        public RecordState() {
            throw null;
        }

        public static RecordState valueOf(String str) {
            return (RecordState) Enum.valueOf(RecordState.class, str);
        }

        public static RecordState[] values() {
            return (RecordState[]) $VALUES.clone();
        }
    }

    /* compiled from: ClipsEditorVoiceOverRecordButton.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RecordState.values().length];
            try {
                iArr[RecordState.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecordState.RECORDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ClipsEditorVoiceOverRecordButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        h9 h9Var = new h9(this, 21);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.t = msy.a(lazyThreadSafetyMode, h9Var);
        this.u = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.presenter.b(this, 14));
        this.v = msy.a(lazyThreadSafetyMode, new qc(this, 15));
        this.w = msy.a(lazyThreadSafetyMode, new s5(this, 27));
        this.x = msy.a(lazyThreadSafetyMode, new t5(this, 24));
        RecordState recordState = RecordState.IDLE;
        this.A = recordState;
        LayoutInflater.from(context).inflate(R.layout.clips_voiceover_record_button, this);
        setState(recordState);
        setClipChildren(false);
        setClipToPadding(false);
        VkImageSimple btnView = getBtnView();
        ixd ixdVar = ad0.g;
        ixd.b bVar = (ixdVar == null ? null : ixdVar).a;
        btnView.setImageResource(R.drawable.vk_icon_voice_outline_28);
        ixd ixdVar2 = ad0.g;
        ixd.a aVar = (ixdVar2 != null ? ixdVar2 : null).b;
        ColorStateList valueOf = ColorStateList.valueOf(context.getColor(R.color.vk_sky_300));
        getIdleContainer().setBackgroundTintList(valueOf);
        getRecordAnimatedBackground().setBackgroundTintList(valueOf);
        getRecordAnimatedCenter().setBackgroundTintList(valueOf);
        jjc.g(this, new e1(this, 25));
        setOnLongClickListener(new View.OnLongClickListener() { // from class: xsna.y0e
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                int i = ClipsEditorVoiceOverRecordButton.B;
                awt0.p(view);
                ClipsEditorVoiceOverRecordButton clipsEditorVoiceOverRecordButton = ClipsEditorVoiceOverRecordButton.this;
                clipsEditorVoiceOverRecordButton.z = true;
                gzs<s3q0> gzsVar = clipsEditorVoiceOverRecordButton.y;
                if (gzsVar == null) {
                    return false;
                }
                gzsVar.invoke();
                return false;
            }
        });
        setOnGenericMotionListener(new View.OnGenericMotionListener() { // from class: xsna.z0e
            @Override // android.view.View.OnGenericMotionListener
            public final boolean onGenericMotion(View view, MotionEvent motionEvent) {
                gzs<s3q0> gzsVar;
                int i = ClipsEditorVoiceOverRecordButton.B;
                if (motionEvent.getAction() != 1) {
                    return false;
                }
                ClipsEditorVoiceOverRecordButton clipsEditorVoiceOverRecordButton = ClipsEditorVoiceOverRecordButton.this;
                if (clipsEditorVoiceOverRecordButton.z && (gzsVar = clipsEditorVoiceOverRecordButton.y) != null) {
                    gzsVar.invoke();
                }
                clipsEditorVoiceOverRecordButton.z = false;
                return true;
            }
        });
    }

    public static void P4(ClipsEditorVoiceOverRecordButton clipsEditorVoiceOverRecordButton) {
        f4m.j(clipsEditorVoiceOverRecordButton.getRecordContainer());
    }

    public static void Q4(ClipsEditorVoiceOverRecordButton clipsEditorVoiceOverRecordButton) {
        f4m.j(clipsEditorVoiceOverRecordButton.getIdleContainer());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkImageSimple getBtnView() {
        return (VkImageSimple) this.u.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final View getIdleContainer() {
        return (View) this.t.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final View getRecordAnimatedBackground() {
        return (View) this.w.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final View getRecordAnimatedCenter() {
        return (View) this.x.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final View getRecordContainer() {
        return (View) this.v.getValue();
    }

    public final void T4(int i) {
        float width = ((((i - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * (140.0f - 100.0f)) / (32768.0f - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) + 100.0f) / (getRecordAnimatedBackground().getWidth() / (getContext().getResources().getDisplayMetrics().densityDpi / 160));
        getRecordAnimatedBackground().animate().scaleX(width).scaleY(width).setInterpolator(new OvershootInterpolator()).setDuration(100L);
    }

    public final RecordState getState() {
        return this.A;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getRecordContainer().clearAnimation();
    }

    public final void setOnRecordClickListener(gzs<s3q0> gzsVar) {
        this.y = gzsVar;
    }

    public final void setState(RecordState recordState) {
        this.A = recordState;
        int i = a.$EnumSwitchMapping$0[recordState.ordinal()];
        if (i == 1) {
            xo2.d(31, 0L, getIdleContainer());
            xo2.e(getRecordContainer(), 0L, new xqc(this, 1), 7);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            xo2.e(getIdleContainer(), 0L, new or4(this, 1), 7);
            xo2.d(31, 0L, getRecordContainer());
        }
    }
}
