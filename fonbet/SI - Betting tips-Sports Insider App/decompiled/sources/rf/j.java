package rf;

import java.io.File;
import java.util.Iterator;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    public final File f22507a;

    /* renamed from: b, reason: collision with root package name */
    public final FileWalkDirection f22508b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f22509c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f22510d;

    /* renamed from: e, reason: collision with root package name */
    public final Function2 f22511e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22512f;

    public j(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function12, Function2 function2, int i5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        fileWalkDirection = (i10 & 2) != 0 ? FileWalkDirection.f19228a : fileWalkDirection;
        i5 = (i10 & 32) != 0 ? Integer.MAX_VALUE : i5;
        this.f22507a = file;
        this.f22508b = fileWalkDirection;
        this.f22509c = function1;
        this.f22510d = function12;
        this.f22511e = function2;
        this.f22512f = i5;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new h(this);
    }
}
