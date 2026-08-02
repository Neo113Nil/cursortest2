package Zf;

import ag.C1955a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import bg.k;
import com.zoho.livechat.android.models.SalesIQChat;
import java.util.List;
import kotlin.jvm.functions.Function1;
import od.r;
import og.AbstractC5891c;

/* loaded from: classes4.dex */
public class e extends RecyclerView.h {

    /* renamed from: a, reason: collision with root package name */
    public List f14795a;

    /* renamed from: b, reason: collision with root package name */
    public k.b f14796b;

    /* renamed from: c, reason: collision with root package name */
    public SalesIQChat f14797c = null;

    public enum a {
        Chat,
        Call
    }

    public e(List list, k.b bVar) {
        this.f14795a = list;
        this.f14796b = bVar;
    }

    public static /* synthetic */ Boolean c(e eVar, SalesIQChat salesIQChat) {
        return eVar.f14797c != null ? Boolean.valueOf(salesIQChat.getChid().equals(eVar.f14797c.getChid())) : Boolean.FALSE;
    }

    public static /* synthetic */ void d(final e eVar, ViewGroup viewGroup, SalesIQChat salesIQChat) {
        SalesIQChat salesIQChat2 = eVar.f14797c;
        if (salesIQChat2 != null && salesIQChat2.getChid() != null && !eVar.f14797c.getChid().equals(salesIQChat.getChid())) {
            RecyclerView.F e02 = ((RecyclerView) viewGroup).e0(AbstractC5891c.a(eVar.f14795a, new Function1() { // from class: Zf.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Boolean valueOf;
                    valueOf = Boolean.valueOf(e.this.f14797c.getChid().equals(((SalesIQChat) obj).getChid()));
                    return valueOf;
                }
            }));
            if (e02 instanceof Ve.d) {
                ((Ve.d) e02).m();
            }
        }
        eVar.f14797c = salesIQChat;
    }

    public void f(List list) {
        this.f14795a = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        List list = this.f14795a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return ((SalesIQChat) this.f14795a.get(i10)).getType() == SalesIQChat.c.Call ? a.Call.ordinal() : a.Chat.ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.F f10, int i10) {
        if (f10 instanceof C1955a) {
            ((C1955a) f10).o((SalesIQChat) this.f14795a.get(i10));
        } else if (f10 instanceof Ve.d) {
            ((Ve.d) f10).b((SalesIQChat) this.f14795a.get(i10));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.F onCreateViewHolder(final ViewGroup viewGroup, int i10) {
        return i10 == a.Call.ordinal() ? new Ve.d(ud.c.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false), new Function1() { // from class: Zf.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.c(e.this, (SalesIQChat) obj);
            }
        }, new k.b() { // from class: Zf.c
            @Override // bg.k.b
            public final void a(SalesIQChat salesIQChat) {
                e.d(e.this, viewGroup, salesIQChat);
            }
        }) : new C1955a(LayoutInflater.from(viewGroup.getContext()).inflate(r.f60752N, viewGroup, false), this.f14796b);
    }
}
