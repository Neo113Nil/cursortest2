package ru.ozon.app.android.action;

import N3.C3660k;
import Tg.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/action/DismissAndRefreshAndScroll;", "LTg/b$c;", "", "id", "link", "LTg/b$f;", "scrollTo", "<init>", "(Ljava/lang/String;Ljava/lang/String;LTg/b$f;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getLink", "LTg/b$f;", "getScrollTo", "()LTg/b$f;", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DismissAndRefreshAndScroll implements b.c {
    private final String id;
    private final String link;
    private final b.f scrollTo;

    public DismissAndRefreshAndScroll(String str, String str2, b.f fVar) {
        this.id = str;
        this.link = str2;
        this.scrollTo = fVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DismissAndRefreshAndScroll)) {
            return false;
        }
        DismissAndRefreshAndScroll dismissAndRefreshAndScroll = (DismissAndRefreshAndScroll) other;
        return Intrinsics.d(this.id, dismissAndRefreshAndScroll.id) && Intrinsics.d(this.link, dismissAndRefreshAndScroll.link) && Intrinsics.d(this.scrollTo, dismissAndRefreshAndScroll.scrollTo);
    }

    @Override // Tg.b
    public String getId() {
        return this.id;
    }

    @Override // Tg.b.c
    public String getLink() {
        return this.link;
    }

    @Override // Tg.b.c
    public b.f getScrollTo() {
        return this.scrollTo;
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.link;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        b.f fVar = this.scrollTo;
        return hashCode2 + (fVar != null ? fVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.link;
        b.f fVar = this.scrollTo;
        StringBuilder d11 = C3660k.d("DismissAndRefreshAndScroll(id=", str, ", link=", str2, ", scrollTo=");
        d11.append(fVar);
        d11.append(")");
        return d11.toString();
    }
}
