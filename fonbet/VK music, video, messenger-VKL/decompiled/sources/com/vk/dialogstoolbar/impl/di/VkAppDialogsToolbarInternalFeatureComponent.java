package com.vk.dialogstoolbar.impl.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.im.reporters.api.di.ImReportersComponent;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.fpf0;
import xsna.iwm;
import xsna.nwy;
import xsna.qcy;
import xsna.rns0;

/* compiled from: VkAppDialogsToolbarInternalFeatureComponent.kt */
/* loaded from: classes18.dex */
public final class VkAppDialogsToolbarInternalFeatureComponent implements DialogsToolbarInternalFeatureComponent {
    public static final /* synthetic */ qcy<Object>[] d;
    public final VkOnboardingComponent a;
    public final ImReportersComponent b;
    public final nwy c = new nwy(new rns0(this, 6));

    /* compiled from: VkAppDialogsToolbarInternalFeatureComponent.kt */
    public static final class a implements b7m<DialogsToolbarInternalFeatureComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new VkAppDialogsToolbarInternalFeatureComponent((VkOnboardingComponent) e7mVar.a(fpf0.a(VkOnboardingComponent.class)), (ImReportersComponent) e7mVar.a(fpf0.a(ImReportersComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VkAppDialogsToolbarInternalFeatureComponent.class, "componentFactory", "getComponentFactory()Lcom/vk/dialogstoolbar/impl/di/factory/DialogsToolbarMviComponentFactory;", 0);
        fpf0.a.getClass();
        d = new qcy[]{propertyReference1Impl};
    }

    public VkAppDialogsToolbarInternalFeatureComponent(VkOnboardingComponent vkOnboardingComponent, ImReportersComponent imReportersComponent) {
        this.a = vkOnboardingComponent;
        this.b = imReportersComponent;
    }

    @Override // com.vk.dialogstoolbar.impl.di.DialogsToolbarInternalFeatureComponent
    public final iwm ra() {
        qcy<Object> qcyVar = d[0];
        return (iwm) this.c.c();
    }
}
