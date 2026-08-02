package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public class zzaex {
    private zzaex() {
    }

    public static Object zza(String str, Type type) {
        if (type == String.class) {
            try {
                zzagt zzagtVar = (zzagt) new zzagt().zza(str);
                if (zzagtVar.zzb()) {
                    return zzagtVar.zza();
                }
                throw new zzacn("No error message: " + str);
            } catch (Exception e10) {
                throw new zzacn("Json conversion failed! " + e10.getMessage(), e10);
            }
        }
        if (type == Void.class) {
            return null;
        }
        try {
            try {
                return ((zzaez) ((Class) type).getConstructor(null).newInstance(null)).zza(str);
            } catch (Exception e11) {
                throw new zzacn("Json conversion failed! " + e11.getMessage(), e11);
            }
        } catch (Exception e12) {
            throw new zzacn("Instantiation of JsonResponse failed! " + String.valueOf(type), e12);
        }
    }
}
