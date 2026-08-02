package com.vk.newsfeed.impl.views;

import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.fcn;

/* compiled from: TaggedPhotosBottomSheet.kt */
/* loaded from: classes4.dex */
public final class c implements fcn {
    public final /* synthetic */ Ref$ObjectRef<a> b;

    public c(Ref$ObjectRef<a> ref$ObjectRef) {
        this.b = ref$ObjectRef;
    }

    @Override // xsna.fcn
    public final boolean M4() {
        return true;
    }

    @Override // xsna.fcn
    public final boolean N8() {
        return false;
    }

    @Override // xsna.fcn
    public final void b(boolean z) {
        a aVar = this.b.element;
        if (aVar != null) {
            aVar.hide();
        }
    }

    @Override // xsna.fcn
    public final void dismiss() {
        b(false);
    }

    @Override // xsna.fcn
    public final boolean v6() {
        return false;
    }
}
