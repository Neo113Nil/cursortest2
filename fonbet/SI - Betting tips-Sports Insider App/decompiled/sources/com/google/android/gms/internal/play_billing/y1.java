package com.google.android.gms.internal.play_billing;

import java.util.logging.Logger;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public final k f5651a = new k();

    /* renamed from: b, reason: collision with root package name */
    public final String f5652b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Logger f5653c;

    public y1(Class cls) {
        this.f5652b = cls.getName();
    }

    public final Logger a() {
        Logger logger = this.f5653c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f5651a) {
            try {
                Logger logger2 = this.f5653c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f5652b);
                this.f5653c = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
