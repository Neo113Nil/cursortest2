package com.vk.ads.easypromote.impl.presentation;

import android.os.Bundle;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ads.easypromote.api.domain.model.EasyPromoteSettings;
import com.vk.ads.easypromote.impl.domain.model.DurationOption;
import com.vk.mvi.androidx.MviImplFragment;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.ao50;
import xsna.awf;
import xsna.bih;
import xsna.ewo;
import xsna.fpf0;
import xsna.ioo;
import xsna.k9x;
import xsna.km50;
import xsna.kwo;
import xsna.mk50;
import xsna.msy;
import xsna.nf3;
import xsna.qcy;
import xsna.qwo;
import xsna.rl3;
import xsna.rwo;
import xsna.udo;
import xsna.ul8;
import xsna.uvo;
import xsna.uwo;
import xsna.vds;
import xsna.vk50;
import xsna.w8i;
import xsna.wmc;
import xsna.wvo;
import xsna.ymk;
import xsna.yvo;

/* compiled from: EasyPromoteSettingsFragment.kt */
/* loaded from: classes14.dex */
public final class EasyPromoteSettingsFragment extends MviImplFragment<yvo, uwo, uvo> implements vds, w8i {
    public static final /* synthetic */ qcy<Object>[] S;
    public final Object Q = msy.a(LazyThreadSafetyMode.NONE, new bih(this, 14));
    public final nf3 R = new nf3();

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(EasyPromoteSettingsFragment.class, "contentView", "getContentView()Lcom/vk/ads/easypromote/impl/presentation/EasyPromoteSettingsView;", 0);
        fpf0.a.getClass();
        S = new qcy[]{mutablePropertyReference1Impl};
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        qwo qwoVar = new qwo(requireContext(), this);
        qcy<Object> qcyVar = S[0];
        nf3 nf3Var = this.R;
        nf3Var.c = qwoVar;
        return new mk50.c(((qwo) nf3Var.getValue(this, qcyVar)).c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ((qwo) this.R.getValue(this, S[0])).f((uwo) ao50Var, new wmc(1, this, EasyPromoteSettingsFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 2));
    }

    @Override // xsna.vds
    public final int Q0() {
        return 1;
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((yvo) vk50Var).f.a(new udo(this, 1), this);
    }

    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Object obj;
        int length = wvo.a().length;
        awf awfVar = new awf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (length - 1) / 10.0f);
        EasyPromoteSettings b = ((kwo) this.Q.getValue()).b();
        float U = rl3.U(Integer.valueOf(b.c), wvo.a()) / 10.0f;
        int i = b.b;
        Date date = new Date(System.currentTimeMillis());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(6, i);
        String format = new SimpleDateFormat("dd MMMM, EE", Locale.getDefault()).format(calendar.getTime());
        Iterator<E> it = DurationOption.h().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((DurationOption) obj).i() == i) {
                break;
            }
        }
        DurationOption durationOption = (DurationOption) obj;
        if (durationOption == null) {
            durationOption = DurationOption.CUSTOM;
        }
        android.icu.util.Calendar calendar2 = android.icu.util.Calendar.getInstance();
        calendar2.add(6, 1);
        Date time = calendar2.getTime();
        int i2 = calendar2.get(1);
        calendar2.add(1, 10);
        ymk ymkVar = new ymk(new k9x(i2, calendar2.get(1), 1), time, b.d);
        return new yvo(new uvo.d(U, awfVar, length, durationOption, format, ymkVar), new ewo(new rwo.a(new ul8(U, awfVar, length, wvo.a()[(int) (U * 10.0f)].intValue()), new ioo(wvo.b, format), ymkVar)));
    }
}
