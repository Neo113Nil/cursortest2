package com.vk.clips.design.view.editor.speed;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.clips.design.view.seek.WheelSeekView;
import com.vk.clips.editor.state.model.a;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import io.jsonwebtoken.JwtParser;
import java.util.Arrays;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.text.Regex;
import xsna.ad0;
import xsna.bbb0;
import xsna.e3m;
import xsna.ekk0;
import xsna.f4m;
import xsna.guj0;
import xsna.hkk0;
import xsna.ikk0;
import xsna.il7;
import xsna.irc0;
import xsna.ixd;
import xsna.j1k0;
import xsna.jkk0;
import xsna.kyd;
import xsna.msy;
import xsna.os30;
import xsna.p5;
import xsna.qah0;
import xsna.s3q0;
import xsna.tbe0;
import xsna.wlb0;
import xsna.x8d;

/* compiled from: SpeedView.kt */
/* loaded from: classes16.dex */
public final class SpeedView extends ConstraintLayout {
    public static final /* synthetic */ int B = 0;
    public final Object A;
    public ekk0.a t;
    public float u;
    public float v;
    public final Object w;
    public final Object x;
    public final Object y;
    public final Object z;

    public SpeedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ikk0 ikk0Var = new ikk0(this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.w = msy.a(lazyThreadSafetyMode, ikk0Var);
        this.x = msy.a(lazyThreadSafetyMode, new tbe0(this, 11));
        this.y = msy.a(lazyThreadSafetyMode, new irc0(this, 10));
        this.z = msy.a(lazyThreadSafetyMode, new os30(this, 24));
        this.A = msy.a(lazyThreadSafetyMode, new qah0(this, 5));
        LayoutInflater.from(context).inflate(R.layout.layout_speed, this);
        VkImageSimple arrow = getArrow();
        ixd ixdVar = ad0.g;
        ixd.b bVar = (ixdVar == null ? null : ixdVar).a;
        arrow.setImageResource(R.drawable.vk_icon_arrow_right_12);
        getWheelSeekView().setValueMapper(new hkk0());
        getWheelSeekView().setOnSeekListener(new il7(16, this, context));
        getWheelSeekView().setOnStartSeekListener(new j1k0(1, this, context));
        getWheelSeekView().setOnEndSeekListener(new p5(26, this, context));
        getWheelSeekView().setOnLimitReachSeekListener(new bbb0(this, 21));
        getWheelSeekView().setFocusable(true);
        getWheelSeekView().setAccessibilityDelegate(new jkk0(this));
    }

    public static s3q0 P4(SpeedView speedView, Context context) {
        Float a;
        ekk0.a aVar = speedView.t;
        if (aVar != null) {
            float round = Math.round(speedView.v * 10.0f) / 10.0f;
            guj0 guj0Var = ekk0.this.g;
            x8d x8dVar = guj0Var.a;
            kyd kydVar = guj0Var.d;
            if (kydVar == null) {
                kydVar = null;
            }
            kyd f = ekk0.f(kydVar, round);
            guj0Var.e = f;
            if (f == null) {
                f = null;
            }
            x8dVar.g(f);
            a state = guj0Var.b.getState();
            kyd kydVar2 = guj0Var.e;
            if (kydVar2 == null) {
                kydVar2 = null;
            }
            x8dVar.c(guj0.c(state, kydVar2), null, false);
        }
        speedView.getCurrentMultiplyValue().setTextColor(e3m.f(R.attr.vk_ui_text_primary, context));
        float f2 = speedView.v;
        if (0.98f > f2 || f2 > 1.02f) {
            speedView.getTextAfter().setVisibility(0);
            speedView.getArrow().setVisibility(0);
        } else {
            f4m.j(speedView.getTextAfter());
            f4m.j(speedView.getArrow());
            if (speedView.v != 1.0f && (a = hkk0.a.a(1.0f)) != null) {
                speedView.getWheelSeekView().setValue(a.floatValue());
            }
        }
        return s3q0.a;
    }

    public static s3q0 Q4(SpeedView speedView, Context context) {
        ekk0.a aVar = speedView.t;
        if (aVar != null) {
            ekk0.this.g.a.d(true);
        }
        speedView.getCurrentMultiplyValue().setTextColor(e3m.f(R.attr.vk_ui_accent_blue, context));
        Pair<String, String> Y4 = speedView.Y4(speedView.u / speedView.v);
        speedView.getTextAfter().setText(wlb0.t(context, R.string.clips_editor_speed_after, Y4.i(), Y4.j()));
        return s3q0.a;
    }

    public static s3q0 T4(SpeedView speedView, Context context, float f) {
        speedView.getCurrentMultiplyValue().setText(wlb0.t(context, R.string.clips_editor_speed_multiply, Float.valueOf(f)));
        Pair<String, String> Y4 = speedView.Y4(speedView.u / speedView.v);
        speedView.getTextAfter().setText(wlb0.t(context, R.string.clips_editor_speed_after, Y4.i(), Y4.j()));
        speedView.v = f;
        if (0.98f > f || f > 1.02f) {
            speedView.getTextAfter().setVisibility(0);
            speedView.getArrow().setVisibility(0);
        } else {
            f4m.j(speedView.getTextAfter());
            f4m.j(speedView.getArrow());
        }
        return s3q0.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkImageSimple getArrow() {
        return (VkImageSimple) this.y.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final VkText getCurrentMultiplyValue() {
        return (VkText) this.z.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final VkText getTextAfter() {
        return (VkText) this.x.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkText getTextBefore() {
        return (VkText) this.w.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final WheelSeekView getWheelSeekView() {
        return (WheelSeekView) this.A.getValue();
    }

    public final void X4(float f, float f2, long j, ekk0.a aVar) {
        this.t = aVar;
        this.u = f * f2;
        this.v = f2;
        getCurrentMultiplyValue().setText(wlb0.t(getContext(), R.string.clips_editor_speed_multiply, Float.valueOf(f2)));
        Pair<String, String> Y4 = Y4(this.u);
        getTextBefore().setText(wlb0.t(getContext(), R.string.clips_editor_speed_before, Y4.i(), Y4.j()));
        Float a = hkk0.a.a(this.v);
        if (a != null) {
            getWheelSeekView().setValue(a.floatValue());
        }
        getWheelSeekView().setLimitValue(hkk0.a.a((this.u * 1000.0f) / j));
        if (f2 == 1.0f) {
            f4m.j(getTextAfter());
            f4m.j(getArrow());
        } else {
            Pair<String, String> Y42 = Y4(this.u / this.v);
            getTextAfter().setText(wlb0.t(getContext(), R.string.clips_editor_speed_after, Y42.i(), Y42.j()));
        }
    }

    public final Pair<String, String> Y4(float f) {
        long ceil = (long) Math.ceil(f);
        String str = "";
        if (0 <= ceil && ceil < 60) {
            return new Pair<>(getContext().getResources().getQuantityString(R.plurals.clips_editor_speed_length_seconds, (int) f, Arrays.copyOf(new Object[]{new Regex("[.,]0").g(String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1)), "").replace(JwtParser.SEPARATOR_CHAR, ',')}, 1)), "");
        }
        long j = ceil / 60;
        long j2 = ceil - (60 * j);
        if (j2 > 0) {
            str = getContext().getResources().getQuantityString(R.plurals.clips_editor_speed_length_seconds, (int) j2, Arrays.copyOf(new Object[]{Long.valueOf(j2)}, 1));
        }
        return new Pair<>(getContext().getResources().getQuantityString(R.plurals.clips_editor_speed_length_minutes, (int) j, Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1)), str);
    }
}
