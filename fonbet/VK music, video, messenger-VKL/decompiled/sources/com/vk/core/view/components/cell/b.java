package com.vk.core.view.components.cell;

import android.content.Context;
import android.view.View;
import com.vk.core.view.components.cell.VkCell;
import xsna.izs;
import xsna.s3q0;
import xsna.wzs;

/* compiled from: VkCell.kt */
/* loaded from: classes17.dex */
public final class b implements VkCell.e {
    public final /* synthetic */ izs<Context, Object> a;
    public final /* synthetic */ wzs<Object, VkCell.f, s3q0> b;

    /* compiled from: VkCell.kt */
    public static final class a implements VkCell.d {
        public final Object a;
        public final /* synthetic */ wzs<Object, VkCell.f, s3q0> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(izs<? super Context, Object> izsVar, Context context, wzs<Object, ? super VkCell.f, s3q0> wzsVar) {
            this.b = wzsVar;
            this.a = (View) izsVar.invoke(context);
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            this.b.invoke(this.a, fVar);
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final Object getView() {
            return this.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(izs<? super Context, Object> izsVar, wzs<Object, ? super VkCell.f, s3q0> wzsVar) {
        this.a = izsVar;
        this.b = wzsVar;
    }

    @Override // com.vk.core.view.components.cell.VkCell.e
    public final VkCell.d create(Context context) {
        return new a(this.a, context, this.b);
    }
}
