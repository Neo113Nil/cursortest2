package io.sentry.android.replay;

import io.sentry.b5;
import io.sentry.b6;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import okio.Segment;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final b6 f16051a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.protocol.v f16052b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f16053c;

    /* renamed from: d, reason: collision with root package name */
    public final io.sentry.util.a f16054d;

    /* renamed from: e, reason: collision with root package name */
    public final io.sentry.util.a f16055e;

    /* renamed from: f, reason: collision with root package name */
    public final io.sentry.util.a f16056f;

    /* renamed from: g, reason: collision with root package name */
    public ec.y f16057g;

    /* renamed from: h, reason: collision with root package name */
    public final gf.t f16058h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f16059i;
    public final LinkedHashMap j;

    /* renamed from: k, reason: collision with root package name */
    public final gf.t f16060k;

    public j(b6 options, io.sentry.protocol.v replayId) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(replayId, "replayId");
        this.f16051a = options;
        this.f16052b = replayId;
        this.f16053c = new AtomicBoolean(false);
        this.f16054d = new io.sentry.util.a();
        this.f16055e = new io.sentry.util.a();
        this.f16056f = new io.sentry.util.a();
        this.f16058h = gf.k.b(new h(this, 1));
        this.f16059i = new ArrayList();
        this.j = new LinkedHashMap();
        this.f16060k = gf.k.b(new h(this, 0));
    }

    public final void c(File screenshot, long j, String str) {
        Intrinsics.checkNotNullParameter(screenshot, "screenshot");
        k kVar = new k(screenshot, j, str);
        io.sentry.r a7 = this.f16056f.a();
        try {
            this.f16059i.add(kVar);
            Unit unit = Unit.f19194a;
            u6.h.g(a7, null);
        } finally {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.r a7 = this.f16054d.a();
        try {
            ec.y yVar = this.f16057g;
            if (yVar != null) {
                yVar.c();
            }
            this.f16057g = null;
            Unit unit = Unit.f19194a;
            u6.h.g(a7, null);
            this.f16053c.set(true);
        } finally {
        }
    }

    public final void k(File file) {
        b6 b6Var = this.f16051a;
        try {
            if (file.delete()) {
                return;
            }
            b6Var.getLogger().h(b5.ERROR, "Failed to delete replay frame: %s", file.getAbsolutePath());
        } catch (Throwable th2) {
            b6Var.getLogger().b(b5.ERROR, th2, "Failed to delete replay frame: %s", file.getAbsolutePath());
        }
    }

    public final File n() {
        return (File) this.f16058h.getValue();
    }

    public final void r(String key, String str) {
        File file;
        File file2;
        List split$default;
        gf.t tVar = this.f16060k;
        LinkedHashMap linkedHashMap = this.j;
        Intrinsics.checkNotNullParameter(key, "key");
        io.sentry.r a7 = this.f16055e.a();
        try {
            if (this.f16053c.get()) {
                u6.h.g(a7, null);
                return;
            }
            File file3 = (File) tVar.getValue();
            if ((file3 == null || !file3.exists()) && (file = (File) tVar.getValue()) != null) {
                file.createNewFile();
            }
            if (linkedHashMap.isEmpty() && (file2 = (File) tVar.getValue()) != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2), Charsets.UTF_8), Segment.SIZE);
                try {
                    Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
                    bg.k kVar = new bg.k(bufferedReader);
                    Intrinsics.checkNotNullParameter(kVar, "<this>");
                    Iterator it = new bg.a(kVar).iterator();
                    while (it.hasNext()) {
                        split$default = StringsKt__StringsKt.split$default((String) it.next(), new String[]{"="}, false, 2, 2, null);
                        linkedHashMap.put((String) split$default.get(0), (String) split$default.get(1));
                    }
                    bufferedReader.close();
                } finally {
                }
            }
            if (str == null) {
                linkedHashMap.remove(key);
            } else {
                linkedHashMap.put(key, str);
            }
            File file4 = (File) tVar.getValue();
            if (file4 != null) {
                Set entrySet = linkedHashMap.entrySet();
                Intrinsics.checkNotNullExpressionValue(entrySet, "<get-entries>(...)");
                rf.l.b(file4, CollectionsKt.J(entrySet, "\n", null, null, c.f15952g, 30));
                Unit unit = Unit.f19194a;
            }
            u6.h.g(a7, null);
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String t(long j) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        io.sentry.r a7 = this.f16056f.a();
        try {
            kotlin.collections.z.q(this.f16059i, new i(j, this, objectRef));
            u6.h.g(a7, null);
            return (String) objectRef.element;
        } finally {
        }
    }
}
