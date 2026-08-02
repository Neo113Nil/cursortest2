package defpackage;

import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerFollowEntityStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class j0m {
    public final BlazeMomentsPlayerFollowEntityStyle a;
    public final glm b;
    public final Function2 c;

    public /* synthetic */ j0m(BlazeMomentsPlayerFollowEntityStyle blazeMomentsPlayerFollowEntityStyle, glm glmVar, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(blazeMomentsPlayerFollowEntityStyle, (i & 2) != 0 ? null : glmVar, (i & 4) != 0 ? null : function2);
    }

    public static j0m copy$default(j0m j0mVar, BlazeMomentsPlayerFollowEntityStyle blazeMomentsPlayerFollowEntityStyle, glm glmVar, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            blazeMomentsPlayerFollowEntityStyle = j0mVar.a;
        }
        if ((i & 2) != 0) {
            glmVar = j0mVar.b;
        }
        if ((i & 4) != 0) {
            function2 = j0mVar.c;
        }
        j0mVar.getClass();
        blazeMomentsPlayerFollowEntityStyle.getClass();
        return new j0m(blazeMomentsPlayerFollowEntityStyle, glmVar, function2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0m)) {
            return false;
        }
        j0m j0mVar = (j0m) obj;
        return Intrinsics.c(this.a, j0mVar.a) && Intrinsics.c(this.b, j0mVar.b) && Intrinsics.c(this.c, j0mVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        glm glmVar = this.b;
        int hashCode2 = (hashCode + (glmVar == null ? 0 : glmVar.hashCode())) * 31;
        Function2 function2 = this.c;
        return hashCode2 + (function2 != null ? function2.hashCode() : 0);
    }

    public final String toString() {
        return "BlazeFollowEntityViewData(style=" + this.a + ", followEntity=" + this.b + ", onFollowClicked=" + this.c + ')';
    }

    public j0m(@NotNull BlazeMomentsPlayerFollowEntityStyle blazeMomentsPlayerFollowEntityStyle, @Nullable glm glmVar, @Nullable Function2<? super Boolean, ? super glm, Unit> function2) {
        blazeMomentsPlayerFollowEntityStyle.getClass();
        this.a = blazeMomentsPlayerFollowEntityStyle;
        this.b = glmVar;
        this.c = function2;
    }
}
