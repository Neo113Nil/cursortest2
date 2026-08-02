package androidx.work;

import android.net.Network;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import xsna.hwx0;
import xsna.iyx0;
import xsna.ovj;
import xsna.rvx0;
import xsna.twx0;

/* loaded from: classes.dex */
public final class WorkerParameters {

    @NonNull
    public UUID a;

    @NonNull
    public Data b;

    @NonNull
    public HashSet c;

    @NonNull
    public a d;
    public int e;

    @NonNull
    public Executor f;

    @NonNull
    public ovj g;

    @NonNull
    public hwx0 h;

    @NonNull
    public iyx0 i;

    @NonNull
    public twx0 j;

    @NonNull
    public rvx0 k;

    public static class a {

        @NonNull
        public List<String> a;

        @NonNull
        public List<Uri> b;

        @Nullable
        public Network c;

        public a() {
            List list = Collections.EMPTY_LIST;
            this.a = list;
            this.b = list;
        }
    }

    public WorkerParameters() {
        throw null;
    }
}
