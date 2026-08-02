package com.vk.censoredsettings.di;

import com.vk.censoredsettings.api.di.CensoredSettingsComponent;
import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.fc;
import xsna.fpf0;
import xsna.npa;
import xsna.nwy;
import xsna.qcy;

/* compiled from: CensoredSettingsComponentImpl.kt */
/* loaded from: classes16.dex */
public final class CensoredSettingsComponentImpl implements CensoredSettingsComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new fc(4));

    /* compiled from: CensoredSettingsComponentImpl.kt */
    public static final class a implements b7m<CensoredSettingsComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new CensoredSettingsComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(CensoredSettingsComponentImpl.class, "censoredSettingsInteractor", "getCensoredSettingsInteractor()Lcom/vk/censoredsettings/domain/interactor/CensoredSettingsInteractorImpl;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.censoredsettings.api.di.CensoredSettingsComponent
    public final npa hf() {
        qcy<Object> qcyVar = b[0];
        return (npa) this.a.c();
    }
}
