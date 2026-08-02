package ru.ozon.app.android.pdfviewer.data.cache;

import java.io.File;
import java.io.IOException;

/* loaded from: classes13.dex */
public class SimpleFileManager implements FileManager {
    private File dir;

    public SimpleFileManager(File file) {
        this.dir = file;
    }

    private IOException formatException(String str, File file) {
        return new IOException(String.format(str, file.getName()));
    }

    @Override // ru.ozon.app.android.pdfviewer.data.cache.FileManager
    public File accept(File file, String str) throws IOException {
        File file2 = get(str);
        if (((this.dir.exists() || this.dir.mkdirs()) | (file2.exists() && file2.delete())) || file.renameTo(file2)) {
            return file2;
        }
        throw formatException("Unable to accept file %s", file);
    }

    @Override // ru.ozon.app.android.pdfviewer.data.cache.FileManager
    public void delete(String str) throws IOException {
        File file = new File(this.dir, str);
        if (file.exists() && !file.delete()) {
            throw formatException("Unable to delete file %s", file);
        }
    }

    @Override // ru.ozon.app.android.pdfviewer.data.cache.FileManager
    public File get(String str) {
        return new File(this.dir, str);
    }

    @Override // ru.ozon.app.android.pdfviewer.data.cache.FileManager
    public File journal() {
        return new File(this.dir, "journal.bin");
    }

    @Override // ru.ozon.app.android.pdfviewer.data.cache.FileManager
    public void prepare() throws IOException {
        if (!this.dir.exists() && !this.dir.mkdirs()) {
            throw new IOException("Unable to create specified cache directory");
        }
    }
}
