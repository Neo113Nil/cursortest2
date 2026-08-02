package com.vk.documents.impl.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.documents.api.di.DocumentsComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.bvn;
import xsna.e7m;
import xsna.fp;
import xsna.fpf0;
import xsna.gzs;
import xsna.kbe;
import xsna.nwy;
import xsna.qcy;
import xsna.te0;
import xsna.tun;
import xsna.z34;

/* compiled from: DocumentsComponentImpl.kt */
/* loaded from: classes18.dex */
public final class DocumentsComponentImpl implements DocumentsComponent {
    public static final /* synthetic */ qcy<Object>[] d = {new PropertyReference1Impl(DocumentsComponentImpl.class, "documentsFactory", "getDocumentsFactory()Lcom/vk/documents/api/di/DocumentsFactory;", 0), fp.c(0, DocumentsComponentImpl.class, "documentsRouter", "getDocumentsRouter()Lcom/vk/documents/api/router/DocumentsRouter;", fpf0.a)};
    public final gzs<bvn> a;
    public final nwy b = new nwy(new te0(16));
    public final nwy c = new nwy(new kbe(this, 16));

    /* compiled from: DocumentsComponentImpl.kt */
    public static final class a implements b7m<DocumentsComponent> {
        public final z34 a = new z34(8);

        public a(int i) {
        }

        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new DocumentsComponentImpl(this.a);
        }
    }

    public DocumentsComponentImpl(z34 z34Var) {
        this.a = z34Var;
    }

    @Override // com.vk.documents.api.di.DocumentsComponent
    public final bvn F7() {
        qcy<Object> qcyVar = d[1];
        return (bvn) this.c.c();
    }

    @Override // com.vk.documents.api.di.DocumentsComponent
    public final tun P0() {
        qcy<Object> qcyVar = d[0];
        return (tun) this.b.c();
    }
}
