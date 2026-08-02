package c9;

import android.graphics.Point;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbk;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuz;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvb;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvd;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: c9.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5769a {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f56810a;

    /* renamed from: c9.a$c */
    public static class c extends d {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c9.a$d */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f56813a;

        /* renamed from: b, reason: collision with root package name */
        private final Rect f56814b;

        /* renamed from: c, reason: collision with root package name */
        private final String f56815c;

        d(String str, String str2, List list, Rect rect) {
            this.f56813a = str;
            this.f56814b = new Rect(rect);
            Point[] pointArr = new Point[list.size()];
            for (int i11 = 0; i11 < list.size(); i11++) {
                pointArr[i11] = new Point((Point) list.get(i11));
            }
            this.f56815c = str2;
        }

        public Rect a() {
            return this.f56814b;
        }

        @NonNull
        public String b() {
            return this.f56815c;
        }

        @NonNull
        public String c() {
            String str = this.f56813a;
            return str == null ? "" : str;
        }
    }

    public C5769a(@NonNull zzvf zzvfVar) {
        ArrayList arrayList = new ArrayList();
        this.f56810a = arrayList;
        zzvfVar.zza();
        arrayList.addAll(zzbu.zza(zzvfVar.zzb(), new C5772d()));
    }

    @NonNull
    public final List<e> a() {
        return Collections.unmodifiableList(this.f56810a);
    }

    public C5769a(@NonNull zzbk zzbkVar) {
        ArrayList arrayList = new ArrayList();
        this.f56810a = arrayList;
        arrayList.addAll(zzbkVar);
    }

    /* renamed from: c9.a$b */
    public static class b extends d {

        /* renamed from: d, reason: collision with root package name */
        private final List f56812d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        b(@NonNull zzvd zzvdVar) {
            super(r0, zzvdVar.zzd(), zzvdVar.zzf(), r1);
            String zze = zzvdVar.zze();
            Rect zzc = zzvdVar.zzc();
            this.f56812d = zzbu.zza(zzvdVar.zzg(), new f());
        }

        public b(@NonNull String str, @NonNull Rect rect, @NonNull List list, @NonNull String str2, @NonNull List list2) {
            super(str, str2, list, rect);
            this.f56812d = list2;
        }
    }

    /* renamed from: c9.a$e */
    public static class e extends d {

        /* renamed from: d, reason: collision with root package name */
        private final List f56816d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        e(@NonNull zzuz zzuzVar) {
            super(r0, zzuzVar.zzb(), zzuzVar.zzd(), r1);
            String zzc = zzuzVar.zzc();
            Rect zza = zzuzVar.zza();
            this.f56816d = zzbu.zza(zzuzVar.zze(), new g());
        }

        @NonNull
        public final synchronized List<b> d() {
            return this.f56816d;
        }

        public e(@NonNull String str, @NonNull Rect rect, @NonNull List list, @NonNull String str2, @NonNull List list2) {
            super(str, str2, list, rect);
            this.f56816d = list2;
        }
    }

    /* renamed from: c9.a$a, reason: collision with other inner class name */
    public static class C0859a extends d {

        /* renamed from: d, reason: collision with root package name */
        private final List f56811d;

        C0859a(@NonNull zzvb zzvbVar) {
            super(zzvbVar.zze(), zzvbVar.zzd(), zzvbVar.zzf(), zzvbVar.zzc());
            zzvbVar.zzb();
            zzvbVar.zza();
            List zzg = zzvbVar.zzg();
            this.f56811d = zzbu.zza(zzg == null ? new ArrayList() : zzg, new c9.e());
        }

        public C0859a(@NonNull String str, @NonNull Rect rect, @NonNull List list, @NonNull String str2, @NonNull zzbk zzbkVar) {
            super(str, str2, list, rect);
            this.f56811d = zzbkVar;
        }
    }
}
