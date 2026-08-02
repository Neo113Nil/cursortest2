package lc;

import kotlin.jvm.internal.Intrinsics;
import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final int f19668a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19669b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19670c;

    public b(int i5, String question, String answer) {
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(answer, "answer");
        this.f19668a = i5;
        this.f19669b = question;
        this.f19670c = answer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f19668a == bVar.f19668a && Intrinsics.areEqual(this.f19669b, bVar.f19669b) && Intrinsics.areEqual(this.f19670c, bVar.f19670c);
    }

    @Override // lc.c
    public final String getAnswer() {
        return this.f19670c;
    }

    @Override // lc.c
    public final int getId() {
        return this.f19668a;
    }

    @Override // lc.c
    public final String getQuestion() {
        return this.f19669b;
    }

    public final int hashCode() {
        return this.f19670c.hashCode() + k.j(this.f19668a * 31, 31, this.f19669b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FrequentQuestion(id=");
        sb2.append(this.f19668a);
        sb2.append(", question=");
        sb2.append(this.f19669b);
        sb2.append(", answer=");
        return d9.e.k(sb2, this.f19670c, ')');
    }
}
