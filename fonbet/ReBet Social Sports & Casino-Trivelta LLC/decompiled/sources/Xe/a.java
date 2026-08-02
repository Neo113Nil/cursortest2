package Xe;

import com.zoho.livechat.android.modules.core.domain.entities.Channel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import od.w;
import og.i;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: Xe.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0285a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[We.a.values().length];
            try {
                iArr[We.a.CHAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[We.a.CALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[We.a.CHAT_AND_CALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Se.a a(We.a aVar) {
        int i10 = C0285a.$EnumSwitchMapping$0[aVar.ordinal()];
        if (i10 == 1) {
            return Se.a.CHAT;
        }
        if (i10 == 2) {
            return Se.a.CALL;
        }
        if (i10 == 3) {
            return Se.a.CHAT_AND_CALL;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final List b(List list, We.a aVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(c((Channel.Department) it.next(), aVar));
        }
        return arrayList;
    }

    public static final w c(Channel.Department department, We.a aVar) {
        Intrinsics.checkNotNullParameter(department, "<this>");
        String id2 = department.getId();
        String name = department.getName();
        Boolean valueOf = Boolean.valueOf(i.i(department.isOnline()));
        String displayName = department.getDisplayName();
        boolean i10 = i.i(department.isEngaged());
        Long queueSize = department.getQueueSize();
        long longValue = queueSize != null ? queueSize.longValue() : -1L;
        Long currentQueueSize = department.getCurrentQueueSize();
        return new w(id2, name, valueOf, displayName, i10, longValue, currentQueueSize != null ? currentQueueSize.longValue() : -1L, aVar != null ? a(aVar) : null);
    }

    public static /* synthetic */ List d(List list, We.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = null;
        }
        return b(list, aVar);
    }

    public static /* synthetic */ w e(Channel.Department department, We.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = null;
        }
        return c(department, aVar);
    }
}
