package com.vk.libvideo.bottomsheet.about.delegate;

import android.content.Context;
import android.text.Spanned;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.Regex;
import xsna.arm0;
import xsna.b4;
import xsna.bqs0;
import xsna.c4;
import xsna.daq0;
import xsna.drm0;
import xsna.e3m;
import xsna.f870;
import xsna.hfz;
import xsna.hik0;
import xsna.i9z;
import xsna.j5g;
import xsna.jai;
import xsna.kjt;
import xsna.kww;
import xsna.l5g;
import xsna.mut0;
import xsna.p1u0;
import xsna.q8z;
import xsna.qjc;
import xsna.s3q0;
import xsna.tjo0;
import xsna.us2;
import xsna.vfz;
import xsna.wh50;
import xsna.wzs;
import xsna.zak0;
import xsna.zk10;

/* compiled from: VideoInfoDelegate.kt */
/* loaded from: classes2.dex */
public final class h0 extends p1u0<AboutVideoItem.o> {
    public final boolean a;
    public final c4 b;

    /* compiled from: VideoInfoDelegate.kt */
    public final class a extends vfz<AboutVideoItem.o> {
        public static final /* synthetic */ int o = 0;
        public final ComposeView l;
        public final wh50 m;

        /* compiled from: VideoInfoDelegate.kt */
        /* renamed from: com.vk.libvideo.bottomsheet.about.delegate.h0$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1218a extends FunctionReferenceImpl implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
            @Override // xsna.wzs
            public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
                androidx.compose.runtime.a aVar2 = aVar;
                int intValue = num.intValue();
                wzs wzsVar = (wzs) this.receiver;
                int i = a.o;
                aVar2.K(-2063320623);
                wzsVar.invoke(aVar2, Integer.valueOf(intValue & 14));
                aVar2.j();
                return s3q0.a;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(ViewGroup viewGroup) {
            super(r4);
            ComposeView composeView = new ComposeView(viewGroup.getContext(), null, 6);
            composeView.setViewCompositionStrategy(mut0.c.a);
            composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            ComposeView composeView2 = (ComposeView) this.itemView;
            this.l = composeView2;
            this.m = androidx.compose.runtime.k.b(null);
            composeView2.setContent(new jai(-1810687557, new com.vk.movika.tools.controls.seekbar.k(this, 13), true));
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(AboutVideoItem.o oVar) {
            Object obj;
            int i;
            kjt.a aVar;
            long j;
            AboutVideoItem.o oVar2 = oVar;
            ComposeView composeView = this.l;
            Context context = composeView.getContext();
            long c = f870.c(e3m.f(R.attr.vk_ui_text_link, context));
            us2.b bVar = new us2.b();
            CharSequence charSequence = oVar2.b;
            String obj2 = charSequence.toString();
            bVar.g(obj2);
            Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
            int i2 = 0;
            if (spanned != null) {
                Object[] spans = spanned.getSpans(0, spanned.length(), qjc.class);
                for (int length = spans.length; i2 < length; length = length) {
                    qjc qjcVar = (qjc) spans[i2];
                    int spanStart = spanned.getSpanStart(qjcVar);
                    int spanEnd = spanned.getSpanEnd(qjcVar);
                    long c2 = f870.c(qjcVar.getColor());
                    bVar.d(new hik0(c2, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), spanStart, spanEnd);
                    bVar.a(new q8z.a(qjcVar.getClass().getName(), new tjo0(new hik0(c2, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), (hik0) null, new hik0(c2, 0L, null, null, null, null, null, 0L, null, null, null, l5g.c(14, c2, 0.3f), null, null, 63486), 6), new daq0(qjcVar, context, composeView, 1)), spanStart, spanEnd);
                    i2++;
                    spanned = spanned;
                    c = c;
                    spans = spans;
                }
            }
            long j2 = c;
            Object obj3 = null;
            int i3 = 14;
            int i4 = oVar2.c;
            kjt.a aVar2 = new kjt.a(Regex.d(bqs0.a, obj2));
            while (aVar2.hasNext()) {
                zk10 zk10Var = (zk10) aVar2.next();
                List c0 = drm0.c0(zk10Var.getValue(), new String[]{StringUtils.PROCESS_POSTFIX_DELIMITER}, 0, 6);
                ArrayList arrayList = new ArrayList();
                Iterator it = c0.iterator();
                while (it.hasNext()) {
                    Integer m = arm0.m(10, (String) it.next());
                    if (m != null) {
                        arrayList.add(m);
                    }
                }
                List y0 = j5g.y0(arrayList);
                Integer num = (Integer) j5g.b0(0, y0);
                int intValue = num != null ? num.intValue() : 0;
                Integer num2 = (Integer) j5g.b0(1, y0);
                int intValue2 = num2 != null ? num2.intValue() : 0;
                Integer num3 = (Integer) j5g.b0(2, y0);
                int intValue3 = ((num3 != null ? num3.intValue() : 0) * 3600) + (intValue2 * 60) + intValue;
                if (intValue3 < 0 || intValue3 >= i4) {
                    obj = obj3;
                    i = i4;
                    aVar = aVar2;
                    j = j2;
                } else {
                    final long millis = TimeUnit.SECONDS.toMillis(intValue3);
                    int i5 = zk10Var.c().b;
                    int i6 = zk10Var.c().c + 1;
                    i = i4;
                    aVar = aVar2;
                    j = j2;
                    bVar.d(new hik0(j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), i5, i6);
                    obj = null;
                    tjo0 tjo0Var = new tjo0(new hik0(j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), (hik0) null, new hik0(j, 0L, null, null, null, null, null, 0L, null, null, null, l5g.c(i3, j, 0.3f), null, null, 63486), 6);
                    final h0 h0Var = h0.this;
                    bVar.a(new q8z.a("time", tjo0Var, new i9z() { // from class: xsna.aqs0
                        @Override // xsna.i9z
                        public final void a(q8z q8zVar) {
                            com.vk.libvideo.bottomsheet.about.delegate.h0.this.b.d(new b4.h0(millis));
                        }
                    }), i5, i6);
                }
                aVar2 = aVar;
                j2 = j;
                obj3 = obj;
                i4 = i;
                i3 = 14;
            }
            ((zak0) this.m).setValue(new kww(bVar.n()));
        }
    }

    public h0(c4 c4Var, boolean z) {
        this.a = z;
        this.b = c4Var;
    }

    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.o> b(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return (hfzVar instanceof AboutVideoItem.o) && this.a;
    }
}
