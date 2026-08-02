package com.vk.importcontacts.impl.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.importcontacts.api.di.ImportContactsComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.bv0;
import xsna.e7m;
import xsna.ewy;
import xsna.fpf0;
import xsna.oqw;
import xsna.qcy;

/* compiled from: ImportContactsComponentImpl.kt */
/* loaded from: classes2.dex */
public final class ImportContactsComponentImpl implements ImportContactsComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a = new ewy(new bv0(22));

    /* compiled from: ImportContactsComponentImpl.kt */
    public static final class a implements b7m<ImportContactsComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new ImportContactsComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ImportContactsComponentImpl.class, "router", "getRouter()Lcom/vk/importcontacts/api/domain/router/ImportContactsRouter;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.importcontacts.api.di.ImportContactsComponent
    public final oqw a() {
        qcy<Object> qcyVar = b[0];
        return (oqw) this.a.c();
    }
}
