package com.vk.censoredsettings.di;

import com.vk.bridges.di.BridgeComponent;
import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.ewy;
import xsna.fp;
import xsna.fpf0;
import xsna.gc;
import xsna.qcy;
import xsna.yh;

/* compiled from: CensoredSettingsInnerComponent.kt */
/* loaded from: classes16.dex */
public final class CensoredSettingsInnerComponent implements DiUnscopedComponent {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(CensoredSettingsInnerComponent.class, "censoredSettingsRemoteRepository", "getCensoredSettingsRemoteRepository()Lcom/vk/censoredsettings/data/repository/CensoredSettingsRemoteRepositoryImpl;", 0), fp.c(0, CensoredSettingsInnerComponent.class, "censoredSettingsLocalRepository", "getCensoredSettingsLocalRepository()Lcom/vk/censoredsettings/data/repository/CensoredSettingsLocalRepositoryImpl;", fpf0.a)};
    public final ewy a = new ewy(new gc(4));
    public final ewy b;

    /* compiled from: CensoredSettingsInnerComponent.kt */
    public static final class a implements b7m<CensoredSettingsInnerComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new CensoredSettingsInnerComponent((BridgeComponent) e7mVar.a(fpf0.a(BridgeComponent.class)));
        }
    }

    public CensoredSettingsInnerComponent(BridgeComponent bridgeComponent) {
        this.b = new ewy(new yh(bridgeComponent, 15));
    }
}
