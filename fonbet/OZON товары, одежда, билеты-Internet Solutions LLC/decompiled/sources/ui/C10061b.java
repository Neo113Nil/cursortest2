package ui;

import Hi.j;
import androidx.recyclerview.widget.i;
import kotlin.jvm.internal.Intrinsics;
import wi.c;

/* renamed from: ui.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C10061b extends i.d<c> {
    @Override // androidx.recyclerview.widget.i.d
    public final boolean areContentsTheSame(c cVar, c cVar2) {
        c oldItem = cVar;
        c newItem = cVar2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if ((oldItem instanceof c.b) && (newItem instanceof c.b)) {
            return Intrinsics.d(((c.b) oldItem).a(), ((c.b) newItem).a());
        }
        if ((oldItem instanceof c.a) && (newItem instanceof c.a)) {
            return Intrinsics.d(((c.a) oldItem).a(), ((c.a) newItem).a());
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.i.d
    public final boolean areItemsTheSame(c cVar, c cVar2) {
        c oldItem = cVar;
        c newItem = cVar2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if ((oldItem instanceof c.b) && (newItem instanceof c.b)) {
            return Intrinsics.d(((c.b) oldItem).a(), ((c.b) newItem).a());
        }
        if (!(oldItem instanceof c.a) || !(newItem instanceof c.a)) {
            return false;
        }
        c.a aVar = (c.a) oldItem;
        if (aVar.a() instanceof j.c) {
            c.a aVar2 = (c.a) newItem;
            if (aVar2.a() instanceof j.c) {
                return ((j.c) aVar2.a()).getId() == ((j.c) aVar2.a()).getId();
            }
        }
        if (aVar.a() instanceof j.d) {
            c.a aVar3 = (c.a) newItem;
            if (aVar3.a() instanceof j.d) {
                return ((j.d) aVar.a()).a() == ((j.d) aVar3.a()).a();
            }
        }
        if (aVar.a() instanceof j.a) {
            c.a aVar4 = (c.a) newItem;
            if (aVar4.a() instanceof j.a) {
                return Intrinsics.d(((j.a) aVar.a()).getTitle(), ((j.a) aVar4.a()).getTitle());
            }
        }
        if (!(aVar.a() instanceof j.b)) {
            return false;
        }
        c.a aVar5 = (c.a) newItem;
        if (aVar5.a() instanceof j.b) {
            return Intrinsics.d(((j.b) aVar.a()).getTitle(), ((j.b) aVar5.a()).getTitle());
        }
        return false;
    }
}
