package ru.ozon.app.android.composer.domain.cache;

import Sc.o;
import Xc.a;
import Xc.b;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.c;
import qc.g;
import ru.ozon.app.android.composer.domain.cache.ComposerResponseStorageImpl;
import uc.i;
import vc.h;
import vc.p;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u00016B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u000b*\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J1\u0010'\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00162\u0010\u0010%\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010$0#2\u0006\u0010&\u001a\u00020\u000bH\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\bH\u0016¢\u0006\u0004\b)\u0010\nJ\u001f\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b-\u0010.J\u0019\u0010/\u001a\u0004\u0018\u00010\u00112\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b/\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00067"}, d2 = {"Lru/ozon/app/android/composer/domain/cache/ComposerResponseStorageImpl;", "Lru/ozon/app/android/composer/domain/cache/ComposerResponseStorage;", "Lru/ozon/app/android/composer/domain/cache/CachePreferences;", "cachePreferences", "Lru/ozon/app/android/composer/domain/cache/FileHelper;", "fileHelper", "<init>", "(Lru/ozon/app/android/composer/domain/cache/CachePreferences;Lru/ozon/app/android/composer/domain/cache/FileHelper;)V", "", "validateCache", "()V", "Lorg/joda/time/DateTime;", "", "isFileOld", "(Lorg/joda/time/DateTime;)Z", "plus3Hours", "(Lorg/joda/time/DateTime;)Lorg/joda/time/DateTime;", "Ljava/io/File;", "mockDir", "timestamp", "saveResponseTimestamp", "(Ljava/io/File;Lorg/joda/time/DateTime;)V", "", "data", "saveResponseData", "(Ljava/io/File;Ljava/lang/String;)V", "getTimestamp", "(Ljava/io/File;)Lorg/joda/time/DateTime;", "getData", "(Ljava/io/File;)Ljava/lang/String;", "Lru/ozon/app/android/composer/domain/cache/ComposerResponseStorageImpl$FileType;", "fileType", "getMockResponseFile", "(Ljava/io/File;Lru/ozon/app/android/composer/domain/cache/ComposerResponseStorageImpl$FileType;)Ljava/io/File;", "cacheValue", "", "", "params", "dateTime", "saveResponse", "(Ljava/lang/String;[Ljava/lang/Object;Lorg/joda/time/DateTime;)V", "clearCache", "", "key", "Lru/ozon/app/android/composer/domain/cache/CacheBox;", "getResponseMock", "(ILjava/io/File;)Lru/ozon/app/android/composer/domain/cache/CacheBox;", "findResponseMockDirectory", "(I)Ljava/io/File;", "Lru/ozon/app/android/composer/domain/cache/CachePreferences;", "Lru/ozon/app/android/composer/domain/cache/FileHelper;", "Lnc/b;", "disposable", "Lnc/b;", "FileType", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerResponseStorageImpl implements ComposerResponseStorage {

    @NotNull
    private final CachePreferences cachePreferences;
    private InterfaceC8487b disposable;

    @NotNull
    private final FileHelper fileHelper;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.composer.domain.cache.ComposerResponseStorageImpl$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<Throwable, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        AnonymousClass3() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/composer/domain/cache/ComposerResponseStorageImpl$FileType;", "", "<init>", "(Ljava/lang/String;I)V", "DATA", "TIMESTAMP", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class FileType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ FileType[] $VALUES;
        public static final FileType DATA = new FileType("DATA", 0);
        public static final FileType TIMESTAMP = new FileType("TIMESTAMP", 1);

        private static final /* synthetic */ FileType[] $values() {
            return new FileType[]{DATA, TIMESTAMP};
        }

        static {
            FileType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private FileType(String str, int i11) {
        }

        public static FileType valueOf(String str) {
            return (FileType) Enum.valueOf(FileType.class, str);
        }

        public static FileType[] values() {
            return (FileType[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FileType.values().length];
            try {
                iArr[FileType.DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FileType.TIMESTAMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ComposerResponseStorageImpl(@NotNull CachePreferences cachePreferences, @NotNull FileHelper fileHelper) {
        Intrinsics.checkNotNullParameter(cachePreferences, "cachePreferences");
        Intrinsics.checkNotNullParameter(fileHelper, "fileHelper");
        this.cachePreferences = cachePreferences;
        this.fileHelper = fileHelper;
        p k11 = new h(new Callable() { // from class: Ir.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Unit _init_$lambda$0;
                _init_$lambda$0 = ComposerResponseStorageImpl._init_$lambda$0(ComposerResponseStorageImpl.this);
                return _init_$lambda$0;
            }
        }).k(Mc.a.a());
        Ir.b bVar = new Ir.b();
        final AnonymousClass3 anonymousClass3 = AnonymousClass3.INSTANCE;
        i iVar = new i(new g() { // from class: Ir.c
            @Override // qc.g
            public final void accept(Object obj) {
                Function1.this.invoke(obj);
            }
        }, bVar);
        k11.a(iVar);
        this.disposable = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(ComposerResponseStorageImpl composerResponseStorageImpl) {
        composerResponseStorageImpl.validateCache();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1() {
    }

    private final String getData(File mockDir) {
        return new String(bd.h.j(getMockResponseFile(mockDir, FileType.DATA)), Charsets.UTF_8);
    }

    private final File getMockResponseFile(File mockDir, FileType fileType) {
        String str;
        int i11 = WhenMappings.$EnumSwitchMapping$0[fileType.ordinal()];
        if (i11 == 1) {
            str = "response-data";
        } else {
            if (i11 != 2) {
                throw new o();
            }
            str = "response-timestamp";
        }
        return new File(mockDir, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DateTime getTimestamp(File mockDir) {
        return new DateTime(new String(bd.h.j(getMockResponseFile(mockDir, FileType.TIMESTAMP)), Charsets.UTF_8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isFileOld(DateTime dateTime) {
        DateTime l11 = dateTime.l((int) TimeUnit.DAYS.toMillis(1L));
        int i11 = c.f79052b;
        return l11.getMillis() < System.currentTimeMillis();
    }

    private final DateTime plus3Hours(DateTime dateTime) {
        DateTime l11 = dateTime.l((int) TimeUnit.HOURS.toMillis(3L));
        Intrinsics.checkNotNullExpressionValue(l11, "plusMillis(...)");
        return l11;
    }

    private final void saveResponseData(File mockDir, String data) {
        File mockResponseFile = getMockResponseFile(mockDir, FileType.DATA);
        byte[] bytes = data.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        bd.h.n(mockResponseFile, bytes);
    }

    private final void saveResponseTimestamp(File mockDir, DateTime timestamp) {
        File mockResponseFile = getMockResponseFile(mockDir, FileType.TIMESTAMP);
        String cVar = timestamp.toString();
        Intrinsics.checkNotNullExpressionValue(cVar, "toString(...)");
        byte[] bytes = cVar.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        bd.h.n(mockResponseFile, bytes);
    }

    private final void validateCache() {
        FileHelper fileHelper = this.fileHelper;
        fileHelper.clear(fileHelper.getFilesDir(), new ComposerResponseStorageImpl$validateCache$1(this));
    }

    @Override // ru.ozon.app.android.composer.domain.cache.ComposerResponseStorage
    public void clearCache() {
        FileHelper fileHelper = this.fileHelper;
        fileHelper.clear(fileHelper.getFilesDir(), new ComposerResponseStorageImpl$clearCache$1(this));
    }

    @Override // ru.ozon.app.android.composer.domain.cache.ComposerResponseStorage
    public File findResponseMockDirectory(int key) {
        String valueOf = String.valueOf(key);
        File file = new File(this.fileHelper.getFilesDir().getPath(), valueOf);
        if (file.exists()) {
            return file;
        }
        FileHelper fileHelper = this.fileHelper;
        String path = fileHelper.getFilesDir().getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        return fileHelper.findDirectory(path, new ComposerResponseStorageImpl$findResponseMockDirectory$1(valueOf));
    }

    @Override // ru.ozon.app.android.composer.domain.cache.ComposerResponseStorage
    @NotNull
    public CacheBox getResponseMock(int key, @NotNull File mockDir) {
        Intrinsics.checkNotNullParameter(mockDir, "mockDir");
        return new CacheBox(getData(mockDir), getTimestamp(mockDir));
    }

    @Override // ru.ozon.app.android.composer.domain.cache.ComposerResponseStorage
    public void saveResponse(@NotNull String cacheValue, @NotNull Object[] params, @NotNull DateTime dateTime) {
        Intrinsics.checkNotNullParameter(cacheValue, "cacheValue");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(dateTime, "dateTime");
        int generateKey$composer_prodGoogleAllVendorsRelease = ComposerResponseStorage.INSTANCE.generateKey$composer_prodGoogleAllVendorsRelease(params);
        CacheBox cacheBox = new CacheBox(cacheValue, dateTime);
        FileHelper fileHelper = this.fileHelper;
        String path = fileHelper.getFilesDir().getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        File createDir = fileHelper.createDir(path, String.valueOf(generateKey$composer_prodGoogleAllVendorsRelease));
        saveResponseTimestamp(createDir, cacheBox.getTimestamp());
        saveResponseData(createDir, cacheBox.getData());
        this.cachePreferences.setCacheExpiryTime(plus3Hours(cacheBox.getTimestamp()).getMillis());
    }
}
