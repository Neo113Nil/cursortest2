package com.vk.ecomm.design.view.productattaches;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.k;
import com.vk.ecomm.design.compose.productattaches.ProductVideoAttach;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.g6;
import xsna.i6;
import xsna.izs;
import xsna.n2s0;
import xsna.rpo0;
import xsna.s3q0;
import xsna.s6t0;
import xsna.tzq0;
import xsna.u5p0;
import xsna.wh50;
import xsna.zak0;

/* compiled from: VideoProductAttachesViewImpl.kt */
/* loaded from: classes18.dex */
public class VideoProductAttachesViewImpl extends rpo0 implements s6t0 {
    public final wh50 m;
    public final wh50 n;
    public final wh50 o;

    public VideoProductAttachesViewImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.m = k.b(EmptyList.b);
        this.n = k.b(null);
        this.o = k.b(null);
    }

    public static s3q0 B(VideoProductAttachesViewImpl videoProductAttachesViewImpl, int i) {
        izs<Integer, s3q0> onAttachShowHandler = videoProductAttachesViewImpl.getOnAttachShowHandler();
        if (onAttachShowHandler != null) {
            onAttachShowHandler.invoke(Integer.valueOf(i));
        }
        return s3q0.a;
    }

    public static s3q0 C(VideoProductAttachesViewImpl videoProductAttachesViewImpl, ProductVideoAttach productVideoAttach) {
        izs<ProductVideoAttach, s3q0> onAttachClickHandler = videoProductAttachesViewImpl.getOnAttachClickHandler();
        if (onAttachClickHandler != null) {
            onAttachClickHandler.invoke(productVideoAttach);
        }
        return s3q0.a;
    }

    private final List<ProductVideoAttach> getAttaches() {
        return (List) ((zak0) this.m).getValue();
    }

    private final izs<ProductVideoAttach, s3q0> getOnAttachClickHandler() {
        return (izs) ((zak0) this.n).getValue();
    }

    private final izs<Integer, s3q0> getOnAttachShowHandler() {
        return (izs) ((zak0) this.o).getValue();
    }

    private final void setAttaches(List<ProductVideoAttach> list) {
        ((zak0) this.m).setValue(list);
    }

    private final void setOnAttachClickHandler(izs<? super ProductVideoAttach, s3q0> izsVar) {
        ((zak0) this.n).setValue(izsVar);
    }

    private final void setOnAttachShowHandler(izs<? super Integer, s3q0> izsVar) {
        ((zak0) this.o).setValue(izsVar);
    }

    @Override // xsna.rpo0
    public final void A(int i, a aVar) {
        aVar.K(-1466378924);
        if (b.d()) {
            b.f(-1466378924, 8, -1, "com.vk.ecomm.design.view.productattaches.VideoProductAttachesViewImpl.ThemedContent (VideoProductAttachesViewImpl.kt:35)");
        }
        List<ProductVideoAttach> attaches = getAttaches();
        boolean y = aVar.y(this);
        Object x = aVar.x();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (y || x == c0012a) {
            x = new tzq0(this, 3);
            aVar.R(x);
        }
        izs izsVar = (izs) x;
        boolean y2 = aVar.y(this);
        Object x2 = aVar.x();
        if (y2 || x2 == c0012a) {
            x2 = new u5p0(this, 9);
            aVar.R(x2);
        }
        n2s0.b(attaches, izsVar, (izs) x2, null, aVar, 0);
        if (b.d()) {
            b.e();
        }
        aVar.j();
    }

    @Override // xsna.s6t0
    public final void l(List list, g6 g6Var, i6 i6Var) {
        setAttaches(list);
        setOnAttachClickHandler(g6Var);
        setOnAttachShowHandler(i6Var);
    }
}
