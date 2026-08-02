package defpackage;

import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.collections.b;
import kotlin.ranges.IntRange;
import kotlin.text.MatchGroup;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class a5 extends v2 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ a5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public MatchGroup c(int i) {
        Matcher matcher = ((txb) this.b).a;
        IntRange j = llf.j(matcher.start(i), matcher.end(i));
        if (j.a < 0) {
            return null;
        }
        String group = matcher.group(i);
        group.getClass();
        return new MatchGroup(group, j);
    }

    @Override // defpackage.v2, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((b5) obj2).containsValue(obj);
            case 1:
                if (obj == null ? true : obj instanceof MatchGroup) {
                    return super.contains((MatchGroup) obj);
                }
                return false;
            case 2:
                return ((bee) obj2).containsValue(obj);
            case 3:
                return ((cee) obj2).containsValue(obj);
            default:
                return ((uee) obj2).containsValue(obj);
        }
    }

    @Override // defpackage.v2
    public final int getSize() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((b5) obj).d();
            case 1:
                return ((txb) obj).a.groupCount() + 1;
            case 2:
                return ((bee) obj).e;
            case 3:
                return ((cee) obj).e;
            default:
                return ((uee) obj).f.d();
        }
    }

    @Override // defpackage.v2, java.util.Collection
    public boolean isEmpty() {
        switch (this.a) {
            case 1:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.a;
        int i2 = 0;
        int i3 = 1;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new y4(((b5) obj).a().iterator(), 1);
            case 1:
                return new zv4(i5h.n(new oh0(b.h(this), i3), new ida(this, 21)));
            case 2:
                u0k u0kVar = ((bee) obj).d;
                u0kVar.getClass();
                w0k[] w0kVarArr = new w0k[8];
                while (i2 < 8) {
                    w0kVarArr[i2] = new x0k(2);
                    i2++;
                }
                return new qee(u0kVar, w0kVarArr);
            case 3:
                v0k v0kVar = ((cee) obj).d;
                w0k[] w0kVarArr2 = new w0k[8];
                while (i2 < 8) {
                    w0kVarArr2[i2] = new y0k(2);
                    i2++;
                }
                return new ree(v0kVar, w0kVarArr2);
            default:
                return new zee((uee) obj, 2);
        }
    }
}
