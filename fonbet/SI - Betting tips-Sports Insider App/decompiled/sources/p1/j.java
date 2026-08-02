package p1;

import com.sports.insider.data.repository.room.live.LiveTable;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.u;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j extends kotlin.collections.f {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f21422d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final androidx.dynamicanimation.animation.g f21423a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f21424b;

    /* renamed from: c, reason: collision with root package name */
    public final List f21425c;

    public j(androidx.dynamicanimation.animation.g gVar, hf.e eVar, ArrayList arrayList, s.m mVar) {
        if (mVar.f22558b != arrayList.size() + 1) {
            throw new IllegalArgumentException("Outline progress size is expected to be the cubics size + 1");
        }
        int i5 = mVar.f22558b;
        if (i5 == 0) {
            Intrinsics.checkNotNullParameter("FloatList is empty.", LiveTable.messageColumn);
            throw new NoSuchElementException("FloatList is empty.");
        }
        float[] fArr = mVar.f22557a;
        int i10 = 0;
        float f6 = 0.0f;
        if (fArr[0] != 0.0f) {
            throw new IllegalArgumentException("First outline progress value is expected to be zero");
        }
        if (i5 == 0) {
            Intrinsics.checkNotNullParameter("FloatList is empty.", LiveTable.messageColumn);
            throw new NoSuchElementException("FloatList is empty.");
        }
        if (fArr[i5 - 1] != 1.0f) {
            throw new IllegalArgumentException("Last outline progress value is expected to be one");
        }
        this.f21423a = gVar;
        this.f21425c = eVar;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i10 < size) {
            int i11 = i10 + 1;
            if (mVar.a(i11) - mVar.a(i10) > 1.0E-4f) {
                arrayList2.add(new i(this, (c) arrayList.get(i10), f6, mVar.a(i11)));
                f6 = mVar.a(i11);
            }
            i10 = i11;
        }
        i iVar = (i) arrayList2.get(u.e(arrayList2));
        float f10 = iVar.f21419c;
        if (1.0f < f10) {
            throw new IllegalArgumentException("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
        }
        iVar.f21419c = f10;
        iVar.f21420d = 1.0f;
        this.f21424b = arrayList2;
    }

    @Override // kotlin.collections.a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof i) {
            return super.contains((i) obj);
        }
        return false;
    }

    @Override // kotlin.collections.f, java.util.List
    public final Object get(int i5) {
        return (i) this.f21424b.get(i5);
    }

    @Override // kotlin.collections.a
    public final int getSize() {
        return this.f21424b.size();
    }

    @Override // kotlin.collections.f, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof i) {
            return super.indexOf((i) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.f, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof i) {
            return super.lastIndexOf((i) obj);
        }
        return -1;
    }
}
