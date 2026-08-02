package ru.ozon.app.android.pdfviewer.data.cache;

import java.io.File;
import java.io.IOException;

/* loaded from: classes13.dex */
public interface FileManager {
    File accept(File file, String str) throws IOException;

    void delete(String str) throws IOException;

    File get(String str);

    File journal();

    void prepare() throws IOException;
}
