package org.joda.time;

import Bl0.k0;
import java.io.Serializable;
import org.joda.time.base.BaseDuration;

/* loaded from: classes10.dex */
public final class Duration extends BaseDuration implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final Duration f79006a = new Duration(0);
    private static final long serialVersionUID = 2471658376918L;

    public Duration(DateTime dateTime, f fVar) {
        super(dateTime, fVar);
    }

    public static Duration a(long j11) {
        return j11 == 0 ? f79006a : new Duration(j11);
    }

    public static Duration d() {
        return new Duration(k0.t(86400000, 1L));
    }

    public static Duration e() {
        return new Duration(k0.t(60000, 1L));
    }

    public final Duration b(long j11) {
        if (j11 == 0) {
            return this;
        }
        return new Duration(k0.s(getMillis(), k0.t(-1, j11)));
    }
}
