package defpackage;

import java.io.File;
import java.util.Iterator;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class y18 implements Sequence {
    public final File a;
    public final FileWalkDirection b;
    public final Function1 c;
    public final Function1 d;
    public final Function2 e;
    public final int f;

    public y18(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function12, Function2 function2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        fileWalkDirection = (i2 & 2) != 0 ? FileWalkDirection.a : fileWalkDirection;
        i = (i2 & 32) != 0 ? Integer.MAX_VALUE : i;
        this.a = file;
        this.b = fileWalkDirection;
        this.c = function1;
        this.d = function12;
        this.e = function2;
        this.f = i;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new z55(this);
    }
}
