package com.vk.newsfeed.common.util;

import com.vk.core.serialize.Serializer;
import io.reactivex.rxjava3.core.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.asu0;
import xsna.izs;
import xsna.j5g;
import xsna.lx50;
import xsna.s3q0;
import xsna.wmi0;

/* compiled from: NewsfeedViewPostCache.kt */
/* loaded from: classes.dex */
public final class NewsfeedViewPostCache {
    public static final SetWrapper a = new SetWrapper(new LinkedHashSet());

    /* compiled from: NewsfeedViewPostCache.kt */
    public static final class SetWrapper extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<SetWrapper> CREATOR = new a();
        public final Set<String> b;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<SetWrapper> {
            @Override // com.vk.core.serialize.Serializer.c
            public final SetWrapper a(Serializer serializer) {
                ArrayList a = com.vk.core.serialize.a.a(serializer);
                int size = a.size();
                Collection collection = a;
                if (size > 642) {
                    collection = a.subList(size - 642, size);
                }
                return new SetWrapper(new LinkedHashSet(collection));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SetWrapper[i];
            }
        }

        public SetWrapper(Set<String> set) {
            this.b = set;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.l0(j5g.O0(this.b));
        }
    }

    /* compiled from: NewsfeedViewPostCache.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((com.vk.metrics.eventtracking.b) this.receiver).a(th);
            return s3q0.a;
        }
    }

    public static boolean a(String str) {
        return a.b.contains(str);
    }

    public static io.reactivex.rxjava3.disposables.c b() {
        if (!a.b.isEmpty()) {
            return new io.reactivex.rxjava3.disposables.f(io.reactivex.rxjava3.internal.functions.a.b);
        }
        q j = wmi0.a.j("newsfeed:cache:view_post:ids", true, asu0.a.c());
        final i iVar = new i();
        return j.subscribe(new io.reactivex.rxjava3.functions.f() { // from class: xsna.l170
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                com.vk.newsfeed.common.util.i.this.invoke(obj);
            }
        }, new lx50(new a(1, com.vk.metrics.eventtracking.b.a, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0), 1));
    }
}
