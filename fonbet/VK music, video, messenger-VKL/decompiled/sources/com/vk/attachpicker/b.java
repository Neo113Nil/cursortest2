package com.vk.attachpicker;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.mediastore.system.MediaStoreVideoEntry;
import java.util.ArrayList;
import java.util.List;
import xsna.bmk0;
import xsna.e43;

/* compiled from: SelectionContext.kt */
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: SelectionContext.kt */
    public static final class a {
        public static Intent a(Uri uri, boolean z, boolean z2) {
            ArrayList<? extends Parcelable> a = e43.a(uri);
            boolean[] zArr = {z};
            boolean[] zArr2 = {z2};
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("result_files", a);
            bundle.putBooleanArray("result_video_flags", zArr);
            bundle.putBooleanArray("result_send_as_file_flags", zArr2);
            Intent intent = new Intent();
            intent.putExtra("result_attachments", bundle);
            return intent;
        }

        public static Intent b(MediaStoreEntry mediaStoreEntry) {
            Intent a = a(mediaStoreEntry.f(), mediaStoreEntry instanceof MediaStoreVideoEntry, mediaStoreEntry.getHeight() + mediaStoreEntry.getWidth() > 24000);
            a.setData(mediaStoreEntry.f());
            return a;
        }
    }

    /* compiled from: SelectionContext.kt */
    /* renamed from: com.vk.attachpicker.b$b, reason: collision with other inner class name */
    public interface InterfaceC0381b {
        b Yd();
    }

    /* compiled from: SelectionContext.kt */
    public interface d {
        List<Integer> e();
    }

    static Uri n(Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("result_attachments");
        if (bundleExtra == null) {
            return null;
        }
        ArrayList parcelableArrayList = bundleExtra.getParcelableArrayList("result_files");
        boolean[] booleanArray = bundleExtra.getBooleanArray("result_video_flags");
        if (parcelableArrayList == null || booleanArray == null) {
            return null;
        }
        int length = booleanArray.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (!booleanArray[i]) {
                break;
            }
            i++;
        }
        Integer valueOf = Integer.valueOf(i);
        if (i == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            return (Uri) parcelableArrayList.get(valueOf.intValue());
        }
        return null;
    }

    void a(MediaStoreEntry mediaStoreEntry, MediaStoreEntry mediaStoreEntry2, Object obj, bmk0 bmk0Var);

    ArrayList b();

    boolean c(MediaStoreEntry mediaStoreEntry);

    void clear();

    int d(MediaStoreEntry mediaStoreEntry);

    boolean e();

    int f(int i, Integer num, MediaStoreEntry mediaStoreEntry);

    Object g(MediaStoreEntry mediaStoreEntry);

    int h();

    void i(List<? extends MediaStoreEntry> list);

    boolean j(int i);

    int k();

    MediaStoreEntry l(MediaStoreEntry mediaStoreEntry);

    void m(c cVar);

    boolean o(int i, MediaStoreEntry mediaStoreEntry);

    void p(d dVar);

    boolean q(MediaStoreEntry mediaStoreEntry);

    void r(MediaStoreEntry mediaStoreEntry, bmk0 bmk0Var);

    MediaStoreEntry s(MediaStoreEntry mediaStoreEntry);

    void t(MediaStoreEntry mediaStoreEntry, MediaStoreEntry mediaStoreEntry2, Object obj, bmk0 bmk0Var);

    boolean u(MediaStoreEntry mediaStoreEntry);

    int v();

    Intent w();

    /* compiled from: SelectionContext.kt */
    public interface c {
        default boolean c(MediaStoreEntry mediaStoreEntry) {
            return true;
        }

        default void d(MediaStoreEntry mediaStoreEntry) {
        }

        default void a(int i, MediaStoreEntry mediaStoreEntry) {
        }

        default void b(int i, List<Integer> list) {
        }
    }
}
