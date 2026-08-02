package com.iab.omid.library.ironsrc.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.ironsrc.adsession.FriendlyObstructionPurpose;
import defpackage.a70;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class f {
    private static final Pattern b = Pattern.compile("^[a-zA-Z0-9 ]+$");
    private final List<e> a = new ArrayList();

    private void a(String str) {
        String str2;
        if (str != null) {
            if (str.length() > 50) {
                str2 = "FriendlyObstruction has detailed reason over 50 characters in length";
            } else if (b.matcher(str).matches()) {
                return;
            } else {
                str2 = "FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space";
            }
            a70.p(str2);
        }
    }

    private e b(View view) {
        for (e eVar : this.a) {
            if (eVar.c().get() == view) {
                return eVar;
            }
        }
        return null;
    }

    public void c(View view) {
        a(view);
        e b2 = b(view);
        if (b2 != null) {
            this.a.remove(b2);
        }
    }

    public void b() {
        this.a.clear();
    }

    private void a(View view) {
        if (view != null) {
            return;
        }
        a70.p("FriendlyObstruction is null");
    }

    public void a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        a(view);
        a(str);
        if (b(view) == null) {
            this.a.add(new e(view, friendlyObstructionPurpose, str));
        }
    }

    public List<e> a() {
        return this.a;
    }
}
