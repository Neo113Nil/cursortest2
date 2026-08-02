package io.appmetrica.analytics.location.impl;

import android.location.Location;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public LocationFilter f15057a;

    /* renamed from: d, reason: collision with root package name */
    public Location f15060d;

    /* renamed from: e, reason: collision with root package name */
    public long f15061e;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f15059c = new CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final TimePassedChecker f15058b = new TimePassedChecker();

    public t(LocationFilter locationFilter) {
        this.f15057a = locationFilter;
    }
}
