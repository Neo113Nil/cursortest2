package s20;

import android.content.Intent;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface d {

    public static abstract class a implements d {
        @NotNull
        public abstract String getId();

        @NotNull
        public abstract Function1<c, Intent> getIntent();

        @NotNull
        public abstract String getName();
    }
}
