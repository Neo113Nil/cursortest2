package ru.ozon.app.android.core.navigation.destinations;

import EZ.a;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import pZ.f;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0015\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00120\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/core/navigation/destinations/ExternalDestination;", "LpZ/f;", "Landroid/net/Uri;", "uri", "", "newTask", "<init>", "(Landroid/net/Uri;Z)V", "", "toString", "()Ljava/lang/String;", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "Z", "getNewTask", "()Z", "Lkotlin/reflect/d;", "LEZ/a;", "getNavigator", "()Lkotlin/reflect/d;", "navigator", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class ExternalDestination extends f {
    private final boolean newTask;

    @NotNull
    private final Uri uri;

    public ExternalDestination(@NotNull Uri uri, boolean z11) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.uri = uri;
        this.newTask = z11;
    }

    @Override // pZ.f
    @NotNull
    public abstract d<? extends a<?>> getNavigator();

    public boolean getNewTask() {
        return this.newTask;
    }

    @NotNull
    public Uri getUri() {
        return this.uri;
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + "(uri=" + getUri() + ", navigator=" + getNavigator() + ")";
    }
}
