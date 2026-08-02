package hd;

import android.text.SpannableString;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public int f10536a;

    /* renamed from: b, reason: collision with root package name */
    public int f10537b;

    /* renamed from: c, reason: collision with root package name */
    public List f10538c;

    /* renamed from: d, reason: collision with root package name */
    public List f10539d;

    /* renamed from: e, reason: collision with root package name */
    public StringBuilder f10540e;

    /* renamed from: f, reason: collision with root package name */
    public SpannableString f10541f;

    /* renamed from: g, reason: collision with root package name */
    public SpannableString f10542g;

    /* renamed from: h, reason: collision with root package name */
    public Object f10543h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f10544i;
    public final /* synthetic */ i j;

    /* renamed from: k, reason: collision with root package name */
    public int f10545k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, mf.c cVar) {
        super(cVar);
        this.j = iVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f10544i = obj;
        this.f10545k |= Integer.MIN_VALUE;
        return this.j.k(0, 0, this);
    }
}
