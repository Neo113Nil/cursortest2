package ru.ozon.android.messenger.blocks.input.attachments.data;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.utils.i;
import xe.C10720e0;
import xe.C10727i;

/* loaded from: classes10.dex */
public final class j implements g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f85387a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.utils.image.a f85388b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.utils.file.d f85389c;

    public j(@NotNull c fileUploader, @NotNull ru.ozon.android.messenger.utils.image.a attachmentImageResizer, @NotNull ru.ozon.android.messenger.utils.file.d fileHelper) {
        Intrinsics.checkNotNullParameter(fileUploader, "fileUploader");
        Intrinsics.checkNotNullParameter(attachmentImageResizer, "attachmentImageResizer");
        Intrinsics.checkNotNullParameter(fileHelper, "fileHelper");
        this.f85387a = fileUploader;
        this.f85388b = attachmentImageResizer;
        this.f85389c = fileHelper;
    }

    public static final ru.ozon.android.messenger.utils.i c(j jVar, a aVar) {
        String e11;
        ru.ozon.android.messenger.utils.file.d dVar = jVar.f85389c;
        i.a.e eVar = new i.a.e("File read error");
        try {
            File a11 = dVar.a(aVar.d());
            if (a11 != null) {
                String path = a11.getPath();
                String b11 = aVar.b();
                if (b11 != null && (e11 = aVar.e()) != null) {
                    return new i.b(a.a(aVar, null, path, e11, b11, dVar.c(a11), 7));
                }
            }
        } catch (Exception unused) {
        }
        return eVar;
    }

    @Override // ru.ozon.android.messenger.blocks.input.attachments.data.g
    public final Object a(@NotNull a aVar, @NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(He.b.f10879b, new h(this, aVar, str, null), cVar);
    }

    @Override // ru.ozon.android.messenger.blocks.input.attachments.data.g
    public final Object b(@NotNull b bVar, @NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(He.b.f10879b, new i(this, bVar, str, null), cVar);
    }
}
