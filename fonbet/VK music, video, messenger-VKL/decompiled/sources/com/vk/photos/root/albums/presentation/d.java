package com.vk.photos.root.albums.presentation;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.photos.root.albums.presentation.f;
import com.vk.photos.root.albums.presentation.g;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.epx;
import xsna.izs;
import xsna.j03;
import xsna.s0e0;
import xsna.tlo0;
import xsna.tq;

/* compiled from: AlbumsReducer.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class d extends FunctionReferenceImpl implements izs<f, g.b> {
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g.b invoke(f fVar) {
        String str;
        String g;
        tlo0 h;
        f fVar2 = fVar;
        e eVar = (e) this.receiver;
        s0e0 s0e0Var = eVar.e;
        Context context = eVar.f;
        List list = fVar2.b;
        UserId userId = fVar2.g;
        f.a aVar = fVar2.f;
        f.a aVar2 = fVar2.d;
        List list2 = fVar2.c;
        f.a aVar3 = fVar2.e;
        boolean z = (list != null && epx.f(aVar3, f.a.b.a)) || (list2 != null && epx.f(aVar2, f.a.b.a));
        g.b.a aVar4 = null;
        if (aVar3 instanceof f.a.C1497a) {
            g = j03.g(context, ((f.a.C1497a) aVar3).a, R.string.error);
        } else {
            if (!(aVar2 instanceof f.a.C1497a)) {
                str = null;
                f.a.b bVar = f.a.b.a;
                boolean z2 = epx.f(aVar3, bVar) && !epx.f(aVar, bVar);
                if (list2 == null) {
                    list2 = EmptyList.b;
                }
                if (s0e0Var.a(userId)) {
                    String str2 = fVar2.h;
                    if (str2 != null) {
                        tlo0.Companion.getClass();
                        h = tlo0.a.c(R.string.albums_other_user_title_with_name, str2);
                    } else {
                        h = tq.h(tlo0.Companion, R.string.albums_other_user_title);
                    }
                } else {
                    h = tq.h(tlo0.Companion, R.string.albums_current_user_title);
                }
                if (list == null) {
                    list = EmptyList.b;
                }
                g.d dVar = new g.d(list2, h, list);
                if (aVar != null) {
                    if (aVar.equals(bVar)) {
                        aVar4 = g.b.a.C1499b.a;
                    } else {
                        if (!(aVar instanceof f.a.C1497a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        j03.g(context, ((f.a.C1497a) aVar).a, R.string.error);
                        aVar4 = new g.b.a.C1498a();
                    }
                }
                return new g.b(z, dVar, aVar4, str, s0e0Var.a(userId), z2);
            }
            g = j03.g(context, ((f.a.C1497a) aVar2).a, R.string.error);
        }
        str = g;
        f.a.b bVar2 = f.a.b.a;
        if (epx.f(aVar3, bVar2)) {
        }
        if (list2 == null) {
        }
        if (s0e0Var.a(userId)) {
        }
        if (list == null) {
        }
        g.d dVar2 = new g.d(list2, h, list);
        if (aVar != null) {
        }
        return new g.b(z, dVar2, aVar4, str, s0e0Var.a(userId), z2);
    }
}
