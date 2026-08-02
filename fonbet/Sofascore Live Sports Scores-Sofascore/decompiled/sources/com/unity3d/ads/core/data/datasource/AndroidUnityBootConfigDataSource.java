package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.ironsource.U3;
import defpackage.d7a;
import defpackage.fsf;
import defpackage.p2g;
import defpackage.s1;
import defpackage.u2g;
import defpackage.w2g;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.text.Charsets;
import kotlin.text.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidUnityBootConfigDataSource;", "Lcom/unity3d/ads/core/data/datasource/UnityBootConfigDataSource;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getValue", "", U3.i.W, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidUnityBootConfigDataSource implements UnityBootConfigDataSource {

    @NotNull
    private final Context context;

    public AndroidUnityBootConfigDataSource(@NotNull Context context) {
        context.getClass();
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getValue$lambda$2$lambda$1$lambda$0(String str, fsf fsfVar, String str2) {
        str2.getClass();
        if (c.v(str2, str, false)) {
            fsfVar.a = str2.substring(str.length());
        }
        return Unit.a;
    }

    @Override // com.unity3d.ads.core.data.datasource.UnityBootConfigDataSource
    @Nullable
    public String getValue(@NotNull String key) {
        Object u2gVar;
        key.getClass();
        try {
            p2g p2gVar = w2g.b;
            String concat = key.concat(U3.j.b);
            fsf fsfVar = new fsf();
            InputStream open = this.context.getAssets().open("bin/Data/boot.config");
            try {
                open.getClass();
                d7a.u(new BufferedReader(new InputStreamReader(open, Charsets.UTF_8), 8192), new s1(9, concat, fsfVar));
                Unit unit = Unit.a;
                open.close();
                u2gVar = (String) fsfVar.a;
            } finally {
            }
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        if (u2gVar instanceof u2g) {
            u2gVar = null;
        }
        return (String) u2gVar;
    }
}
