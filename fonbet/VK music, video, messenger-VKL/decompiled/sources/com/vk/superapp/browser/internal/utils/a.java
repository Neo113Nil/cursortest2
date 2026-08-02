package com.vk.superapp.browser.internal.utils;

import android.content.Context;
import com.vk.superapp.browser.internal.utils.VkWebFileChooserImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import xsna.e520;
import xsna.o1w0;
import xsna.wx20;

/* compiled from: VkWebFileChooserImpl.kt */
/* loaded from: classes6.dex */
public final class a extends wx20 {
    public boolean c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ o1w0 e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ VkWebFileChooserImpl g;

    public a(ArrayList arrayList, o1w0 o1w0Var, ArrayList arrayList2, VkWebFileChooserImpl vkWebFileChooserImpl) {
        this.d = arrayList;
        this.e = o1w0Var;
        this.f = arrayList2;
        this.g = vkWebFileChooserImpl;
    }

    @Override // xsna.wx20
    public final List<e520> a() {
        return this.f;
    }

    @Override // xsna.wx20
    public final void f(Context context, e520 e520Var) {
        this.c = true;
        for (VkWebFileChooserImpl.PickAction pickAction : this.d) {
            if (pickAction.i() == e520Var.a) {
                this.e.invoke(pickAction);
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // xsna.wx20
    public final void g() {
        if (this.c) {
            return;
        }
        this.g.l();
    }
}
