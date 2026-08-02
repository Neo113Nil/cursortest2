package com.vk.profile.community.members.impl.ui;

import com.vk.dto.common.id.UserId;
import com.vk.profile.community.members.api.CommunityMembersFilter;
import com.vk.profile.community.members.impl.domain.MembersListBanner;
import com.vk.profile.community.members.impl.ui.c;
import com.vk.profile.community.members.impl.ui.k;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.a220;
import xsna.dah;
import xsna.eah;
import xsna.fah;
import xsna.hah;
import xsna.myc0;
import xsna.s3q0;
import xsna.uvj;

/* compiled from: MembersStore.kt */
/* loaded from: classes5.dex */
public final class j {
    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(2:10|11)(2:15|16))(4:17|18|(1:20)(1:23)|(1:22))|12|13))|26|6|7|(0)(0)|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        com.vk.log.L.j(r4, "Error closing banner");
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a220 a220Var, k.a aVar, ContinuationImpl continuationImpl) {
        g gVar;
        int i;
        if (continuationImpl instanceof g) {
            gVar = (g) continuationImpl;
            int i2 = gVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.label = i2 - Integer.MIN_VALUE;
                Object obj = gVar.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    fah fahVar = a220Var.d;
                    UserId userId = a220Var.a;
                    String str = aVar.b;
                    gVar.L$0 = null;
                    gVar.L$1 = null;
                    gVar.label = 1;
                    Object k = myc0.k(fahVar.a, new dah(userId, str, null), gVar);
                    if (k != obj2) {
                        k = s3q0.a;
                    }
                    if (k == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return s3q0.a;
            }
        }
        gVar = new g(continuationImpl);
        Object obj3 = gVar.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gVar.label;
        if (i != 0) {
        }
        return s3q0.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:20|21))(3:22|23|(1:25))|12|13|(1:15)|16|17))|32|6|7|(0)(0)|12|13|(0)|16|17|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0037, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        r8 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0035, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        r8 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(uvj uvjVar, a220 a220Var, k.c cVar, ContinuationImpl continuationImpl) {
        h hVar;
        int i;
        if (continuationImpl instanceof h) {
            hVar = (h) continuationImpl;
            int i2 = hVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.label = i2 - Integer.MIN_VALUE;
                Object obj = hVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = hVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    fah fahVar = a220Var.d;
                    UserId userId = a220Var.a;
                    hVar.L$0 = uvjVar;
                    hVar.L$1 = null;
                    hVar.L$2 = cVar;
                    hVar.I$0 = 0;
                    hVar.I$1 = 0;
                    hVar.label = 1;
                    obj = myc0.k(fahVar.a, new eah(userId, fahVar, null), hVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = (k.c) hVar.L$2;
                    uvjVar = (uvj) hVar.L$0;
                    kotlin.a.a(obj);
                }
                Object failure = (MembersListBanner) obj;
                uvjVar.e(new c.C1634c((MembersListBanner) (failure instanceof Result.Failure ? null : failure), cVar.b));
                return s3q0.a;
            }
        }
        hVar = new h(continuationImpl);
        Object obj2 = hVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = hVar.label;
        if (i != 0) {
        }
        Object failure2 = (MembersListBanner) obj2;
        uvjVar.e(new c.C1634c((MembersListBanner) (failure2 instanceof Result.Failure ? null : failure2), cVar.b));
        return s3q0.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|7|(1:(2:10|11)(2:24|25))(3:26|27|(1:29))|12|(4:17|18|19|20)|23|18|19|20))|45|6|7|(0)(0)|12|(5:14|17|18|19|20)|23|18|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0036, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        r7.e(new com.vk.profile.community.members.impl.ui.c.e(false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008a, code lost:
    
        if ((r8 instanceof com.vk.api.sdk.exceptions.VKApiExecutionException) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
    
        r9 = (com.vk.api.sdk.exceptions.VKApiExecutionException) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0091, code lost:
    
        if (r9 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0093, code lost:
    
        r4 = new java.lang.Integer(r9.s());
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009c, code lost:
    
        if (r4 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a7, code lost:
    
        r7.e(com.vk.profile.community.members.impl.ui.c.d.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ad, code lost:
    
        if (r4 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b7, code lost:
    
        r7.e(new com.vk.profile.community.members.impl.ui.c.f(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0090, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(uvj uvjVar, a220 a220Var, k.b bVar, ContinuationImpl continuationImpl) {
        i iVar;
        int i;
        String str;
        boolean z;
        if (continuationImpl instanceof i) {
            iVar = (i) continuationImpl;
            int i2 = iVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.label = i2 - Integer.MIN_VALUE;
                Object obj = iVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = iVar.label;
                Integer num = null;
                if (i != 0) {
                    kotlin.a.a(obj);
                    hah hahVar = a220Var.c;
                    UserId userId = a220Var.a;
                    CommunityMembersFilter communityMembersFilter = a220Var.b;
                    String str2 = bVar.b;
                    iVar.L$0 = uvjVar;
                    iVar.L$1 = null;
                    iVar.L$2 = bVar;
                    iVar.label = 1;
                    obj = hahVar.a(userId, communityMembersFilter, str2, iVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (k.b) iVar.L$2;
                    uvjVar = (uvj) iVar.L$0;
                    kotlin.a.a(obj);
                }
                Pair pair = (Pair) obj;
                List list = (List) pair.d();
                str = (String) pair.g();
                boolean z2 = bVar.d;
                if (str != null && str.length() != 0) {
                    z = false;
                    uvjVar.e(new c.b(str, list, z2, !z));
                    return s3q0.a;
                }
                z = true;
                uvjVar.e(new c.b(str, list, z2, !z));
                return s3q0.a;
            }
        }
        iVar = new i(continuationImpl);
        Object obj2 = iVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = iVar.label;
        Integer num2 = null;
        if (i != 0) {
        }
        Pair pair2 = (Pair) obj2;
        List list2 = (List) pair2.d();
        str = (String) pair2.g();
        boolean z22 = bVar.d;
        if (str != null) {
            z = false;
            uvjVar.e(new c.b(str, list2, z22, !z));
            return s3q0.a;
        }
        z = true;
        uvjVar.e(new c.b(str, list2, z22, !z));
        return s3q0.a;
    }
}
