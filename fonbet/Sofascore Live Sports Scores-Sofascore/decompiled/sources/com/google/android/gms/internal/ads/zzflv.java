package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzflv {
    public com.google.android.gms.ads.internal.client.zzm a;
    public com.google.android.gms.ads.internal.client.zzr b;
    public String c;
    public com.google.android.gms.ads.internal.client.zzfw d;
    public boolean e;
    public ArrayList f;
    public ArrayList g;
    public zzbmk h;
    public com.google.android.gms.ads.internal.client.zzx i;
    public AdManagerAdViewOptions j;
    public PublisherAdViewOptions k;
    public com.google.android.gms.ads.internal.client.zzcl l;
    public zzbst n;
    public zzeua r;
    public Bundle t;
    public JSONArray w;
    public com.google.android.gms.ads.internal.client.zzcp x;
    public int m = 1;
    public final zzflj o = new zzflj();
    public boolean p = false;
    public boolean q = false;
    public boolean s = false;
    public final AtomicLong u = new AtomicLong();
    public boolean v = false;

    public final zzflw a() {
        Preconditions.j(this.c, "ad unit must not be null");
        Preconditions.j(this.b, "ad size must not be null");
        Preconditions.j(this.a, "ad request must not be null");
        return new zzflw(this);
    }
}
