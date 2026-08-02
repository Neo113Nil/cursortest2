package Zf;

import ag.d1;
import ag.f1;
import ag.h1;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.zoho.livechat.android.modules.knowledgebase.domain.entities.SalesIQResource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import od.r;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class l extends RecyclerView.h {

    /* renamed from: a, reason: collision with root package name */
    public List f14845a;

    /* renamed from: b, reason: collision with root package name */
    public List f14846b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f14847c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14848d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14849e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14850f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f14851g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14852h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f14853i;

    /* renamed from: j, reason: collision with root package name */
    public final Function1 f14854j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f14855k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a ResourceHeaderItem = new a("ResourceHeaderItem", 0);
        public static final a Resource = new a("Resource", 1);
        public static final a ResourceCategory = new a("ResourceCategory", 2);
        public static final a ResourceDepartment = new a("ResourceDepartment", 3);

        private static final /* synthetic */ a[] $values() {
            return new a[]{ResourceHeaderItem, Resource, ResourceCategory, ResourceDepartment};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private a(String str, int i10) {
        }

        @NotNull
        public static EnumEntries<a> getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b ViewsCount = new b("ViewsCount", 0);

        private static final /* synthetic */ b[] $values() {
            return new b[]{ViewsCount};
        }

        static {
            b[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private b(String str, int i10) {
        }

        @NotNull
        public static EnumEntries<b> getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public static final class c extends h.b {

        /* renamed from: a, reason: collision with root package name */
        public final List f14856a;

        /* renamed from: b, reason: collision with root package name */
        public final List f14857b;

        public c(List oldData, List newData) {
            Intrinsics.checkNotNullParameter(oldData, "oldData");
            Intrinsics.checkNotNullParameter(newData, "newData");
            this.f14856a = oldData;
            this.f14857b = newData;
        }

        @Override // androidx.recyclerview.widget.h.b
        public boolean areContentsTheSame(int i10, int i11) {
            SalesIQResource salesIQResource = (SalesIQResource) this.f14856a.get(i10);
            SalesIQResource salesIQResource2 = (SalesIQResource) this.f14857b.get(i11);
            if (!(salesIQResource instanceof SalesIQResource.Data) || !(salesIQResource2 instanceof SalesIQResource.Data)) {
                if (!(salesIQResource instanceof SalesIQResource.a) || !(salesIQResource2 instanceof SalesIQResource.a)) {
                    return ((salesIQResource instanceof SalesIQResource.b) && (salesIQResource2 instanceof SalesIQResource.b)) ? Intrinsics.areEqual(((SalesIQResource.b) salesIQResource).a(), ((SalesIQResource.b) salesIQResource2).a()) : (salesIQResource instanceof SalesIQResource.c) && (salesIQResource2 instanceof SalesIQResource.c) && ((SalesIQResource.c) salesIQResource).b() == ((SalesIQResource.c) salesIQResource2).b();
                }
                SalesIQResource.a aVar = (SalesIQResource.a) salesIQResource;
                SalesIQResource.a aVar2 = (SalesIQResource.a) salesIQResource2;
                return Intrinsics.areEqual(aVar.c(), aVar2.c()) && aVar.a() == aVar2.a() && aVar.b() == aVar2.b();
            }
            SalesIQResource.Data data = (SalesIQResource.Data) salesIQResource;
            SalesIQResource.Data data2 = (SalesIQResource.Data) salesIQResource2;
            if (Intrinsics.areEqual(data.getTitle(), data2.getTitle())) {
                SalesIQResource.Data.Stats stats = data.getStats();
                int k10 = og.i.k(stats != null ? Integer.valueOf(stats.getViewed()) : null);
                SalesIQResource.Data.Stats stats2 = data2.getStats();
                if (k10 == og.i.k(stats2 != null ? Integer.valueOf(stats2.getViewed()) : null)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.h.b
        public boolean areItemsTheSame(int i10, int i11) {
            SalesIQResource salesIQResource = (SalesIQResource) this.f14856a.get(i10);
            SalesIQResource salesIQResource2 = (SalesIQResource) this.f14857b.get(i11);
            return ((salesIQResource instanceof SalesIQResource.Data) && (salesIQResource2 instanceof SalesIQResource.Data)) ? Intrinsics.areEqual(((SalesIQResource.Data) salesIQResource).getId(), ((SalesIQResource.Data) salesIQResource2).getId()) : ((salesIQResource instanceof SalesIQResource.a) && (salesIQResource2 instanceof SalesIQResource.a)) ? Intrinsics.areEqual(((SalesIQResource.a) salesIQResource).getId(), ((SalesIQResource.a) salesIQResource2).getId()) : ((salesIQResource instanceof SalesIQResource.b) && (salesIQResource2 instanceof SalesIQResource.b)) ? Intrinsics.areEqual(((SalesIQResource.b) salesIQResource).getId(), ((SalesIQResource.b) salesIQResource2).getId()) : (salesIQResource instanceof SalesIQResource.c) && (salesIQResource2 instanceof SalesIQResource.c) && ((SalesIQResource.c) salesIQResource).b() == ((SalesIQResource.c) salesIQResource2).b();
        }

        @Override // androidx.recyclerview.widget.h.b
        public Object getChangePayload(int i10, int i11) {
            SalesIQResource salesIQResource = (SalesIQResource) this.f14856a.get(i10);
            SalesIQResource salesIQResource2 = (SalesIQResource) this.f14857b.get(i11);
            if ((salesIQResource instanceof SalesIQResource.Data) && (salesIQResource2 instanceof SalesIQResource.Data)) {
                SalesIQResource.Data data = (SalesIQResource.Data) salesIQResource;
                SalesIQResource.Data data2 = (SalesIQResource.Data) salesIQResource2;
                if (Intrinsics.areEqual(data.getTitle(), data2.getTitle())) {
                    SalesIQResource.Data.Stats stats = data.getStats();
                    int k10 = og.i.k(stats != null ? Integer.valueOf(stats.getViewed()) : null);
                    SalesIQResource.Data.Stats stats2 = data2.getStats();
                    if (k10 != og.i.k(stats2 != null ? Integer.valueOf(stats2.getViewed()) : null)) {
                        return CollectionsKt.listOf(b.ViewsCount);
                    }
                }
            }
            return super.getChangePayload(i10, i11);
        }

        @Override // androidx.recyclerview.widget.h.b
        public int getNewListSize() {
            return this.f14857b.size();
        }

        @Override // androidx.recyclerview.widget.h.b
        public int getOldListSize() {
            return this.f14856a.size();
        }
    }

    public /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.ResourceHeaderItem.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.Resource.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.ResourceCategory.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SalesIQResource.c.b.values().length];
            try {
                iArr2[SalesIQResource.c.b.Resource.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[SalesIQResource.c.b.Related.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[SalesIQResource.c.b.Category.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[SalesIQResource.c.b.Department.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[SalesIQResource.c.b.RecentlyViewed.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[SalesIQResource.c.b.RecentlyViewedFromSearch.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final class e extends Lambda implements Function1 {

        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SalesIQResource.c.b.values().length];
                try {
                    iArr[SalesIQResource.c.b.Resource.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SalesIQResource.c.b.Related.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SalesIQResource.c.b.Category.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[SalesIQResource.c.b.Department.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public e() {
            super(1);
        }

        public final void a(SalesIQResource.c.b resourceType) {
            Intrinsics.checkNotNullParameter(resourceType, "resourceType");
            int i10 = a.$EnumSwitchMapping$0[resourceType.ordinal()];
            if (i10 == 1) {
                l.this.f14848d = !r4.f14848d;
            } else if (i10 == 2) {
                l.this.f14849e = !r4.f14849e;
            } else if (i10 == 3 || i10 == 4) {
                l.this.f14850f = !r4.f14850f;
            }
            l.m(l.this, false, 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SalesIQResource.c.b) obj);
            return Unit.INSTANCE;
        }
    }

    public l(Function1 onResourceItemClicked) {
        Intrinsics.checkNotNullParameter(onResourceItemClicked, "onResourceItemClicked");
        this.f14845a = CollectionsKt.emptyList();
        this.f14846b = CollectionsKt.emptyList();
        boolean z10 = true;
        this.f14848d = true;
        this.f14850f = true;
        this.f14854j = new e();
        this.f14847c = onResourceItemClicked;
        List list = this.f14845a;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SalesIQResource salesIQResource = (SalesIQResource) it.next();
                if (!(salesIQResource instanceof SalesIQResource.Data) && !(salesIQResource instanceof SalesIQResource.c)) {
                    z10 = false;
                    break;
                }
            }
        }
        this.f14855k = z10;
    }

    public static /* synthetic */ void m(l lVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        lVar.l(z10);
    }

    public static /* synthetic */ void p(l lVar, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = null;
        }
        if ((i10 & 2) != 0) {
            bool2 = null;
        }
        if ((i10 & 4) != 0) {
            bool3 = null;
        }
        if ((i10 & 8) != 0) {
            bool4 = null;
        }
        if ((i10 & 16) != 0) {
            z10 = true;
        }
        if ((i10 & 32) != 0) {
            z11 = true;
        }
        lVar.o(bool, bool2, bool3, bool4, z10, z11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f14846b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        SalesIQResource salesIQResource = (SalesIQResource) this.f14846b.get(i10);
        return (salesIQResource instanceof SalesIQResource.c ? a.ResourceHeaderItem : salesIQResource instanceof SalesIQResource.Data ? a.Resource : salesIQResource instanceof SalesIQResource.a ? a.ResourceCategory : a.ResourceDepartment).ordinal();
    }

    public final List i(List list) {
        boolean z10 = this.f14848d;
        if (z10 && this.f14850f && this.f14849e) {
            return list;
        }
        if (z10 && this.f14850f) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                SalesIQResource salesIQResource = (SalesIQResource) obj;
                if (((salesIQResource instanceof SalesIQResource.Data) && !((SalesIQResource.Data) salesIQResource).isRelatedArticle()) || (salesIQResource instanceof SalesIQResource.a) || (salesIQResource instanceof SalesIQResource.c)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        if (z10 && this.f14849e) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                SalesIQResource salesIQResource2 = (SalesIQResource) obj2;
                if ((salesIQResource2 instanceof SalesIQResource.Data) || (salesIQResource2 instanceof SalesIQResource.c)) {
                    arrayList2.add(obj2);
                }
            }
            return arrayList2;
        }
        boolean z11 = this.f14850f;
        if (z11 && this.f14849e) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list) {
                SalesIQResource salesIQResource3 = (SalesIQResource) obj3;
                if ((salesIQResource3 instanceof SalesIQResource.a) || (salesIQResource3 instanceof SalesIQResource.b) || (((salesIQResource3 instanceof SalesIQResource.Data) && ((SalesIQResource.Data) salesIQResource3).isRelatedArticle()) || (salesIQResource3 instanceof SalesIQResource.c))) {
                    arrayList3.add(obj3);
                }
            }
            return arrayList3;
        }
        if (z10) {
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : list) {
                SalesIQResource salesIQResource4 = (SalesIQResource) obj4;
                if (((salesIQResource4 instanceof SalesIQResource.Data) && !((SalesIQResource.Data) salesIQResource4).isRelatedArticle()) || (salesIQResource4 instanceof SalesIQResource.c)) {
                    arrayList4.add(obj4);
                }
            }
            return arrayList4;
        }
        if (this.f14849e) {
            ArrayList arrayList5 = new ArrayList();
            for (Object obj5 : list) {
                SalesIQResource salesIQResource5 = (SalesIQResource) obj5;
                if (((salesIQResource5 instanceof SalesIQResource.Data) && ((SalesIQResource.Data) salesIQResource5).isRelatedArticle()) || (salesIQResource5 instanceof SalesIQResource.c)) {
                    arrayList5.add(obj5);
                }
            }
            return arrayList5;
        }
        if (!z11) {
            ArrayList arrayList6 = new ArrayList();
            for (Object obj6 : list) {
                if (obj6 instanceof SalesIQResource.c) {
                    arrayList6.add(obj6);
                }
            }
            return arrayList6;
        }
        ArrayList arrayList7 = new ArrayList();
        for (Object obj7 : list) {
            SalesIQResource salesIQResource6 = (SalesIQResource) obj7;
            if ((salesIQResource6 instanceof SalesIQResource.a) || ((!this.f14851g && (salesIQResource6 instanceof SalesIQResource.Data) && og.i.e(((SalesIQResource.Data) salesIQResource6).getLastViewedTime())) || (salesIQResource6 instanceof SalesIQResource.c))) {
                arrayList7.add(obj7);
            }
        }
        return arrayList7;
    }

    public final boolean j(SalesIQResource salesIQResource, SalesIQResource salesIQResource2) {
        Intrinsics.checkNotNull(salesIQResource, "null cannot be cast to non-null type com.zoho.livechat.android.modules.knowledgebase.domain.entities.SalesIQResource.ItemHeader");
        switch (d.$EnumSwitchMapping$1[((SalesIQResource.c) salesIQResource).b().ordinal()]) {
            case 1:
            case 2:
                return salesIQResource2 instanceof SalesIQResource.Data;
            case 3:
                return salesIQResource2 instanceof SalesIQResource.a;
            case 4:
                return salesIQResource2 instanceof SalesIQResource.b;
            case 5:
            case 6:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean k() {
        return this.f14855k;
    }

    public final void l(boolean z10) {
        List i10;
        if (this.f14851g) {
            if (this.f14852h) {
                List list = this.f14845a;
                i10 = new ArrayList();
                for (Object obj : list) {
                    SalesIQResource salesIQResource = (SalesIQResource) obj;
                    if (((salesIQResource instanceof SalesIQResource.c) && ((SalesIQResource.c) salesIQResource).b() != SalesIQResource.c.b.RecentlyViewed) || ((salesIQResource instanceof SalesIQResource.Data) && og.i.e(((SalesIQResource.Data) salesIQResource).getRecentlyViewedTimeFromSearch()))) {
                        i10.add(obj);
                    }
                }
            } else {
                i10 = i(this.f14845a);
            }
        } else if (this.f14853i) {
            List list2 = this.f14845a;
            i10 = new ArrayList();
            for (Object obj2 : list2) {
                if (obj2 instanceof SalesIQResource.b) {
                    i10.add(obj2);
                }
            }
        } else {
            i10 = i(this.f14845a);
        }
        if (z10) {
            r(i10);
        } else {
            this.f14846b = i10;
            notifyDataSetChanged();
        }
    }

    public final void n(boolean z10) {
        if (this.f14852h != z10) {
            this.f14852h = z10;
            m(this, false, 1, null);
        }
    }

    public final void o(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, boolean z10, boolean z11) {
        if (bool != null) {
            this.f14848d = bool.booleanValue();
        }
        if (bool2 != null) {
            this.f14850f = bool2.booleanValue();
        }
        if (bool3 != null) {
            boolean booleanValue = bool3.booleanValue();
            this.f14849e = booleanValue;
            this.f14851g = booleanValue;
        }
        if (bool4 != null) {
            this.f14853i = bool4.booleanValue();
        }
        if (z11) {
            l(z10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.F holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        SalesIQResource salesIQResource = (SalesIQResource) this.f14846b.get(i10);
        if (holder instanceof h1) {
            Intrinsics.checkNotNull(salesIQResource, "null cannot be cast to non-null type com.zoho.livechat.android.modules.knowledgebase.domain.entities.SalesIQResource.Data");
            ((h1) holder).c((SalesIQResource.Data) salesIQResource, i10);
            return;
        }
        if (!(holder instanceof of.b)) {
            if (holder instanceof d1) {
                Intrinsics.checkNotNull(salesIQResource, "null cannot be cast to non-null type com.zoho.livechat.android.modules.knowledgebase.domain.entities.SalesIQResource.Category");
                ((d1) holder).c((SalesIQResource.a) salesIQResource, i10);
                return;
            } else {
                if (holder instanceof f1) {
                    Intrinsics.checkNotNull(salesIQResource, "null cannot be cast to non-null type com.zoho.livechat.android.modules.knowledgebase.domain.entities.SalesIQResource.Department");
                    ((f1) holder).c((SalesIQResource.b) salesIQResource);
                    return;
                }
                return;
            }
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            SalesIQResource salesIQResource2 = (SalesIQResource) this.f14846b.get(RangesKt.coerceAtMost(i10 + 1, r1.size() - 1));
            Intrinsics.checkNotNull(salesIQResource, "null cannot be cast to non-null type com.zoho.livechat.android.modules.knowledgebase.domain.entities.SalesIQResource.ItemHeader");
            ((of.b) holder).c((SalesIQResource.c) salesIQResource, j(salesIQResource, salesIQResource2), i10);
            Result.m147constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.F onCreateViewHolder(ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        int i11 = d.$EnumSwitchMapping$0[a.values()[i10].ordinal()];
        if (i11 == 1) {
            View inflate = LayoutInflater.from(parent.getContext()).inflate(r.f60755O0, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            return new of.b(inflate, this.f14854j);
        }
        if (i11 == 2) {
            return new h1(LayoutInflater.from(parent.getContext()).inflate(r.f60738G, parent, false), this.f14847c);
        }
        if (i11 != 3) {
            View inflate2 = LayoutInflater.from(parent.getContext()).inflate(r.f60742I, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(...)");
            return new f1(inflate2, this.f14847c);
        }
        View inflate3 = LayoutInflater.from(parent.getContext()).inflate(r.f60740H, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate3, "inflate(...)");
        return new d1(inflate3, this.f14847c);
    }

    public final void q(List articles, boolean z10) {
        Intrinsics.checkNotNullParameter(articles, "articles");
        this.f14845a = articles;
        l(z10);
    }

    public final void r(List list) {
        h.e b10 = androidx.recyclerview.widget.h.b(new c(this.f14846b, list));
        this.f14846b = CollectionsKt.toList(list);
        b10.c(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.F holder, int i10, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (!payloads.isEmpty()) {
            Object obj = this.f14846b.get(i10);
            SalesIQResource.Data data = obj instanceof SalesIQResource.Data ? (SalesIQResource.Data) obj : null;
            if (data != null) {
                h1 h1Var = holder instanceof h1 ? (h1) holder : null;
                if (h1Var != null) {
                    h1Var.d(data);
                    return;
                }
                return;
            }
            return;
        }
        super.onBindViewHolder(holder, i10, payloads);
    }
}
