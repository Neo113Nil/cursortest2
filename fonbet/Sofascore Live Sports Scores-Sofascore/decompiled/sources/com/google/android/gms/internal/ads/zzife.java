package com.google.android.gms.internal.ads;

import defpackage.yhk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzife {
    public static zziew b() {
        ClassLoader classLoader = zzife.class.getClassLoader();
        if (zziew.class.equals(zziew.class)) {
            try {
                try {
                    return (zziew) zziew.class.cast(((zzife) Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor(null).newInstance(null)).a());
                } catch (ReflectiveOperationException e) {
                    throw new IllegalStateException(e);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        Iterator it = ServiceLoader.load(zzife.class, classLoader).iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            try {
                arrayList.add((zziew) zziew.class.cast(((zzife) it.next()).a()));
            } catch (ServiceConfigurationError e2) {
                Logger.getLogger(zzier.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat("zziew"), (Throwable) e2);
            }
        }
        if (arrayList.size() == 1) {
            return (zziew) arrayList.get(0);
        }
        if (arrayList.size() == 0) {
            return null;
        }
        try {
            return (zziew) zziew.class.getMethod("combine", Collection.class).invoke(null, arrayList);
        } catch (ReflectiveOperationException e3) {
            yhk.q(e3);
            return null;
        }
    }

    public abstract zziew a();
}
