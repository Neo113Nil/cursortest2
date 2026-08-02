package com.vk.music.offline.api.domain.download;

import android.net.Uri;
import com.vk.api.generated.audio.dto.AudioStreamDto;
import com.vk.music.offline.api.domain.download.AudioDownloadManager;

/* compiled from: OneVideoOfflineHelper.kt */
/* loaded from: classes.dex */
public interface b {
    public static final a a = a.a;

    void a(String str);

    AudioDownloadManager.a b(String str);

    boolean c(String str);

    default Object e(String str) {
        return null;
    }

    default AudioDownloadManager.a f(String str) {
        return null;
    }

    void g(String str, AudioStreamDto.TypeDto typeDto, Uri uri, byte[] bArr);

    void h(String str, AudioStreamDto.TypeDto typeDto, Uri uri, byte[] bArr);

    void i(String str);

    void m(String str);

    /* compiled from: OneVideoOfflineHelper.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final b STUB = new C1327a();

        public final b getSTUB() {
            return STUB;
        }

        /* compiled from: OneVideoOfflineHelper.kt */
        /* renamed from: com.vk.music.offline.api.domain.download.b$a$a, reason: collision with other inner class name */
        public static final class C1327a implements b {
            @Override // com.vk.music.offline.api.domain.download.b
            public final AudioDownloadManager.a b(String str) {
                return null;
            }

            @Override // com.vk.music.offline.api.domain.download.b
            public final boolean c(String str) {
                return false;
            }

            @Override // com.vk.music.offline.api.domain.download.b
            public final Object e(String str) {
                return null;
            }

            @Override // com.vk.music.offline.api.domain.download.b
            public final AudioDownloadManager.a f(String str) {
                return null;
            }

            @Override // com.vk.music.offline.api.domain.download.b
            public final void o() {
            }

            @Override // com.vk.music.offline.api.domain.download.b
            public final void a(String str) {
            }

            @Override // com.vk.music.offline.api.domain.download.b
            public final void i(String str) {
            }

            @Override // com.vk.music.offline.api.domain.download.b
            public final void j(String str) {
            }

            @Override // com.vk.music.offline.api.domain.download.b
            public final void m(String str) {
            }

            @Override // com.vk.music.offline.api.domain.download.b
            public final void g(String str, AudioStreamDto.TypeDto typeDto, Uri uri, byte[] bArr) {
            }

            @Override // com.vk.music.offline.api.domain.download.b
            public final void h(String str, AudioStreamDto.TypeDto typeDto, Uri uri, byte[] bArr) {
            }

            @Override // com.vk.music.offline.api.domain.download.b
            public final void l(String str, AudioStreamDto.TypeDto typeDto, Uri uri, byte[] bArr) {
            }
        }
    }

    default void o() {
    }

    default void j(String str) {
    }

    default void l(String str, AudioStreamDto.TypeDto typeDto, Uri uri, byte[] bArr) {
    }
}
