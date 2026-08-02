package defpackage;

import com.sofascore.results.service.WatchService;
import java.io.File;
import java.util.Calendar;
import java.util.List;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class yf2 {
    public final File a;

    public yf2(WatchService watchService, boolean z) {
        String path;
        File externalCacheDir = watchService.getExternalCacheDir();
        File file = new File(wv8.i((externalCacheDir == null || (path = externalCacheDir.getPath()) == null) ? watchService.getCacheDir().getPath() : path, File.separator, "favorite_events"));
        this.a = file;
        int i = 0;
        if (z && file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                while (i < length) {
                    listFiles[i].delete();
                    i++;
                }
            }
            this.a.delete();
            return;
        }
        if (z) {
            return;
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -1);
        File[] listFiles2 = file.listFiles();
        if (listFiles2 != null) {
            int length2 = listFiles2.length;
            while (i < length2) {
                File file2 = listFiles2[i];
                if (calendar.getTimeInMillis() > file2.lastModified()) {
                    file2.delete();
                }
                i++;
            }
        }
    }

    public void a(List list) {
        list.getClass();
        try {
            bga bgaVar = vga.a;
            bgaVar.getClass();
            b28.b(new File(this.a, "favorites_list.json"), bgaVar.c(new xg0(a7a.a, 0), list), Charsets.UTF_8);
        } catch (Exception unused) {
        }
    }

    public yf2(r18 r18Var) {
        this.a = new File((File) r18Var.c, "com.crashlytics.settings.json");
    }
}
